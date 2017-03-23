package edu.wmich.cs1120.la5;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MapCreatorFromDat implements IMapCreator {

	double radiation;
	double energyCost;
	double elevation;
	Integer leftNum;
	Integer rightNum;
	char operand;
	private TerrainScanner scan = new TerrainScanner();
	Integer operationNum;
	Integer seekNum;
	
	/*
	 * I'm using this to check if the operation numbers end with -1 or not.
	 * Still need to set it equal to the values of addition or subtraction
	 */

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {

		RandomAccessFile file = new RandomAccessFile(fileName, "r");
		Area[][] area = new Area[10][10];

		file.seek(0);

		for (int r = 0; r < 10; r++) {

			for (int c = 0; c < 10; c++) {

				try {

					energyCost = file.readDouble();
					elevation = file.readDouble();
					radiation = file.readDouble();
					operand = file.readChar();
					leftNum = file.readInt();
					rightNum = file.readInt();

					operationNum = ExpressionFactory.getExpression(operand, leftNum, rightNum).getValue();
					seekNum = operationNum * 34;
					/*
					 * Not sure where to go from here with all of these classes.
					 * I THINK everything else should work fine, we just need to
					 * complete the operations to iterate through the file.
					 */

					if (radiation >= .5 || (radiation < .5 && elevation > (threshold * .5))) {

						area[r][c] = new HighArea();
						area[r][c].setBasicEnergyCost(energyCost);
						area[r][c].setElevation(elevation);
						area[r][c].setRadiation(radiation);

					} else {

						area[r][c] = new LowArea();
						area[r][c].setBasicEnergyCost(energyCost);
						area[r][c].setElevation(elevation);
						area[r][c].setRadiation(radiation);

					}

					if (operationNum == -1) {

						break;

					} else {

						file.seek(seekNum);

					}

				} catch (EOFException e) {

					break;

				}

			}

		}

		file.close();
		scan.setTerrain(area);

	}

	@Override
	public TerrainScanner getScanner() {

		return scan;

	}

	@Override
	public void setScanner(TerrainScanner scanner) {

		scan = scanner;

	}

}
