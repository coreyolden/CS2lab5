package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MapCreatorFromTxt implements IMapCreator {
	
	TerrainScanner scan = new TerrainScanner();

	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		File toread = new File(fileName);
		BufferedReader read = new BufferedReader(new FileReader(toread));
		Area[][] Area = new Area[10][10];
		double[] fields = new double[3];
		String readLine;
		String[] fieldsSplit;

		for (int r = 0; r < 10; r++) {
			
			for (int c = 0; c < 10; c++) {

				readLine = read.readLine();
				fieldsSplit = (readLine.split(" "));
				
				for (int i = 0; i < 3; i++) {
					
					fields[i] = Double.parseDouble(fieldsSplit[i]);
					
				}

				if (fields[2] >= .5 || fields[1] > (threshold * .5) && fields[2] < .5) {
					
					Area Tile = new HighArea();
					Tile.setBasicEnergyCost(fields[0]);
					Tile.setElevation(fields[1]);
					Tile.setRadiation(fields[2]);
					Area[r][c] = Tile;

				} else {
					
					Area Tile = new LowArea();
					Tile.setBasicEnergyCost(fields[0]);
					Tile.setElevation(fields[1]);
					Tile.setRadiation(fields[2]);
					Area[r][c] = Tile;

				}

			}
		}

		scan.setTerrain(Area);
		read.close();

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
