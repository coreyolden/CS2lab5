package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {

	/**
	 * analyze holds the string to be read from the GUI
	 */
	private String analyze;

	/**
	 * avgElevation is the private field that holds the value for the average
	 * elevation over the path
	 */
	private double avgElevation = 0;

	/**
	 * squares a private arraylist that holds the data for the path
	 */
	private ArrayList<IArea> squares = new ArrayList<IArea>();

	/**
	 * getPath returns the private field squares
	 * 
	 * @return squares
	 */
	public ArrayList<IArea> getPath() {

		return squares;

	}

	/**
	 * setPath sets the private field squares equal to the parameter path
	 * 
	 * @param path
	 */
	public void setPath(ArrayList<IArea> path) {

		squares = path;

	}

	/**
	 * analyzePath adds the Elevation value of each area square along the path
	 * and then divides that sum by the size of the arraylist squares. This gets
	 * us average elevation.
	 */
	public void analyzePath() {

		for (int i = 0; i < squares.size(); i++) {

			avgElevation += squares.get(i).getElevation();

		}

		avgElevation = (avgElevation / squares.size());

	}

	/**
	 * getAnalysis sets the private field analyze to the value of the method
	 * tostring() + the value of the private field avgElevation
	 * 
	 * @return analyze
	 */
	public String getAnalysis() {

		analyze = tostring() + Double.toString(avgElevation);
		return analyze;

	}

	/**
	 * setAnalysis sets the private field analyze equal to the parameter
	 * analysis
	 * 
	 * @param analysis
	 */
	public void setAnalysis(String analysis) {

		analyze = analysis;

	}

	/**
	 * toString returns the string to be used
	 * 
	 * @return "Average Elevation: "
	 */
	public String tostring() {

		return "Average Elevation: ";
	}

}
