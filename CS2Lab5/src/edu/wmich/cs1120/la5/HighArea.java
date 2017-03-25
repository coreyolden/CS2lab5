package edu.wmich.cs1120.la5;

public class HighArea extends Area {

	/**
	 * energy_cost holds the value of the energy cost for each area square
	 */
	private double energy_cost;

	/**
	 * getBasicEnergyCost returns the private field energy_cost
	 * 
	 * @return energy_cost
	 */
	public double getBasicEnergyCost() {

		return energy_cost;

	}

	/**
	 * setBasicEnergyCost sets the private field energy_cost equal to 4 times
	 * the basicEnergyCost for each HighArea square
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {

		energy_cost = 4 * basicEnergyCost;

	}

}
