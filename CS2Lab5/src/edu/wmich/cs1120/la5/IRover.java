package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public interface IRover {

	/**
	 * 
	 * @return IArea arraylist
	 */
	ArrayList<IArea> getPath();

	/**
	 * @param path
	 */
	void setPath(ArrayList<IArea> path);

	/**
	 * does math here
	 */
	void analyzePath();

	/**
	 * @return String
	 */
	String getAnalysis();

	/**
	 * @param analysis
	 */
	void setAnalysis(String analysis);

	/**
	 * @return String
	 */
	String tostring();
	
}
