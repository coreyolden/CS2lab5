package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MapCreatorFromTxt implements IMapCreator {

	TerrainScanner scan = new TerrainScanner();

	/**
	 * scanTerrain is the class where data is read from the .txt file and input
	 * into the correct values throughout the program. More information about
	 * this method can be found in its multi-line comments.
	 * 
	 * @param fileName
	 * @param threshold
	 * @throws IOException
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {

		File toread = new File(fileName);
		BufferedReader read = new BufferedReader(new FileReader(toread));
		Area[][] Area = new Area[10][10];
		double[] fields = new double[3];
		String readLine;
		String[] fieldsSplit;

		for (int r = 0; r < 10; r++) {

			for (int c = 0; c < 10; c++) {

				/*
				 * reads the line of data, splits the data at the spaces, and
				 * stores the data into the fieldsSplit array
				 */
				readLine = read.readLine();
				fieldsSplit = (readLine.split(" "));

				for (int i = 0; i < 3; i++) {

					/*
					 * parses the data in the fieldsSplit array and stores it
					 * into the fields array
					 */
					fields[i] = Double.parseDouble(fieldsSplit[i]);

				}

				/*
				 * checks to see if each area square is a HighArea square or a
				 * LowArea square
				 */
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

		/*
		 * closes the file that was read and passes the array of High and Low
		 * area squares to the TerrainScanner class
		 */
		read.close();
		scan.setTerrain(Area);

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
