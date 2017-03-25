package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	/**
	 * analyze holds the string to be read from the GUI
	 */
	String analyze;

	/**
	 * totalEnergy is the private field that holds the value for the total
	 * energy cost along the path
	 */
	double totalEnergy = 0;

	/**
	 * squares a private arraylist that holds the data for the path
	 */
	ArrayList<IArea> squares = new ArrayList<IArea>();

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
	 * analyzePath adds the basicEnergyCost value of each area square along the
	 * path to find us the value of totalEnergy
	 */
	public void analyzePath() {

		for (int i = 0; i < squares.size(); i++) {

			totalEnergy += squares.get(i).getBasicEnergyCost();

		}

	}

	/**
	 * getAnalysis sets the private field analyze to the value of the method
	 * tostring() + the value of the private field totalEnergy
	 * 
	 * @return analyze
	 */
	public String getAnalysis() {

		analyze = tostring() + Double.toString(totalEnergy);
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
	 * @return "Total Energy Cost: "
	 */
	public String tostring() {

		return "Total Energy Cost: ";

	}

}
