package edu.wmich.cs1120.la5;

public abstract class Area implements IArea{

private double basic_energy;
private double Elevation;
private double Radiation;
public double getBasicEnergyCost(){
	return basic_energy;
}
public void setBasicEnergyCost(double basicEnergyCost){
	basic_energy=basicEnergyCost;
}
public double getElevation(){
	return Elevation;
}
public void setElevation(double elevation){
	Elevation=elevation;
}
public double getRadiation(){
	return Radiation;
}
public void setRadiation(double radiation){
	Radiation=radiation;
}
public double calcConsumedEnergy(){
	return 0;
}
}
