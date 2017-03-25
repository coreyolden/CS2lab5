package edu.wmich.cs1120.la5;

public interface IArea {

	/**
	 * @return basicEnergyCost
	 */
	double getBasicEnergyCost();

	/**
	 * @param basicEnergyCost
	 */
	void setBasicEnergyCost(double basicEnergyCost);

	/**
	 * @return Elevation
	 */
	double getElevation();

	/**
	 * @param elevation
	 */
	void setElevation(double elevation);

	/**
	 * @return Radiation
	 */
	double getRadiation();

	/**
	 * @param radiation
	 */
	void setRadiation(double radiation);

	/**
	 * @return ConsumedEnergy
	 */
	double calcConsumedEnergy();
}
