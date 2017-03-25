package edu.wmich.cs1120.la5;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MapCreatorFromDat implements IMapCreator {

	/**
	 * radiation holds the double value of radiation read from the .dat file
	 */
	private double radiation;

	/**
	 * energyCost holds the double value of energyCost read from the .dat file
	 */
	private double energyCost;

	/**
	 * elevation holds the double value of elevation read from the .dat file
	 */
	private double elevation;

	/**
	 * leftNum holds the value of the first integer read from the .dat file in
	 * order to complete the operation
	 */
	private Integer leftNum;

	/**
	 * rightNum holds the value of the second integer read from the .dat file in
	 * order to complete the operation
	 */
	private Integer rightNum;

	/**
	 * operand holds the value of the character read from the .dat file in order
	 * to complete the operation
	 */
	private char operand;

	/**
	 * scan holds the value of the TerrainScanner object that is instantiated
	 * here
	 */
	private TerrainScanner scan = new TerrainScanner();

	/**
	 * operationNum holds the value of the result of the operation
	 */
	private Integer operationNum;

	/**
	 * seekNum holds the value of the result of multiplying operationNum by the
	 * number of bytes we are searching for
	 */
	private Integer seekNum;

	/**
	 * scanTerrain is the class where data is read from the .dat file and input
	 * into the correct values throughout the program. More information about
	 * this method can be found in its multi-line comments.
	 * 
	 * @param fileName
	 * @param threshold
	 * @throws IOException
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {

		RandomAccessFile file = new RandomAccessFile(fileName, "r");
		Area[][] area = new Area[10][10];

		file.seek(0);

		for (int r = 0; r < 10; r++) {

			for (int c = 0; c < 10; c++) {

				try {

					/*
					 * reads all of the information we need for each iteration
					 */
					energyCost = file.readDouble();
					elevation = file.readDouble();
					radiation = file.readDouble();
					operand = file.readChar();
					leftNum = file.readInt();
					rightNum = file.readInt();

					/*
					 * sets the value of operationNum equal to the returned
					 * value from ExpressionFactory
					 */
					operationNum = ExpressionFactory.getExpression(operand, leftNum, rightNum).getValue();

					/*
					 * seekNum multiples the number to seek from the operation
					 * by the number of bytes being searched for. In this case
					 * it is 34 bytes.
					 */
					seekNum = operationNum * 34;

					/*
					 * checks to see if each area square is a HighArea square or
					 * a LowArea square
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

					/*
					 * if operationNum is -1, the program breaks out of the loop
					 * as it has reached the end of the file. Else the program
					 * searches for the next location of data
					 */
					if (operationNum == -1) {

						break;

					} else {

						file.seek(seekNum);

					}

					/*
					 * if the EndofFileException is thrown, the program breaks
					 * out of the loop.
					 */
				} catch (EOFException e) {

					break;

				}

			}

		}

		/*
		 * closes the file that was read and passes the array of High and Low
		 * area squares to the TerrainScanner class
		 */
		file.close();
		scan.setTerrain(area);

	}

	/**
	 * getScanner returns the private field scan that holds the information of
	 * the TerrainScanner object
	 */
	@Override
	public TerrainScanner getScanner() {

		return scan;

	}

	/**
	 * setScanner sets the private field scan equal to the TerrainScanner
	 * scanner parameter
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {

		scan = scanner;

	}

}
