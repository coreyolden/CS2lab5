package edu.wmich.cs1120.la5;

import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner;


public interface IMapCreator {

	/**
	 * @param fileName
	 * @param threshold
	 * @throws IOException
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;

	/**
	 * 
	 * @return Scanner object
	 */
	TerrainScanner getScanner();

	/**
	 * @param scanner
	 */
	void setScanner(TerrainScanner scanner);
	
}
