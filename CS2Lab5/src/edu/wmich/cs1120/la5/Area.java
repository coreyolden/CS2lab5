package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {
	/**
	 * basic_energy is the energy for each area square
	 */
	private double basic_energy;

	/**
	 * Elevation is the elevation for each area square
	 */
	private double Elevation;

	/**
	 * Radiation is the radiation for each area square
	 */
	private double Radiation;

	/**
	 * getBasicEnergyCost returns the basic_energy value for each area square
	 * 
	 * @return basic_energy
	 */
	public double getBasicEnergyCost() {
		
		return basic_energy;
		
	}

	/**
	 * setBasicEnergyCost sets the value of the private field basic_energy equal
	 * to the parameter basicEnergyCost
	 * 
	 * @param basicEnergyCost
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {
		
		basic_energy = basicEnergyCost;
		
	}

	/**
	 * getElevation returns the Elevation value for each area square
	 * 
	 * @return Elevation
	 */
	public double getElevation() {
		
		return Elevation;
		
	}

	/**
	 * setElevation sets the value of the private field Elevation equal to the
	 * parameter elevation
	 * 
	 * @param elevation
	 */
	public void setElevation(double elevation) {
		
		Elevation = elevation;
		
	}

	/**
	 * getRadiation returns the Radiation value for each area square
	 * 
	 * @return Radiation
	 */
	public double getRadiation() {
		
		return Radiation;
		
	}

	/**
	 * setRadiation sets the value of the private field Radiation equal to the
	 * parameter radiation
	 * 
	 * @param radiation
	 */
	public void setRadiation(double radiation) {
		
		Radiation = radiation;
		
	}

	/**
	 * calcConsumedEnergy is not utilized in this abstract class. However, it is
	 * vital in Area's subclasses.
	 * 
	 * @return double
	 */
	public double calcConsumedEnergy() {
		
		return 0;
		
	}
}
