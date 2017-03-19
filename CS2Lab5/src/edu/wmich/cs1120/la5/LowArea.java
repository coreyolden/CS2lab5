package edu.wmich.cs1120.la5;

public class LowArea extends Area{
	private double energy_cost;
	public double getBasicEnergyCost(){
		return energy_cost;
	}
	public void setBasicEnergyCost(double basicEnergyCost){
		energy_cost = 2*basicEnergyCost;
	}
}
