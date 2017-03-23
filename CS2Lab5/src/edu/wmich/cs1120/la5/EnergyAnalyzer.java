/**This isnt completed because I ran into problems with the other step.
 * 
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	String analyze;
	double totalEnergy = 0;
	ArrayList<IArea> squares = new ArrayList<IArea>();

	
	public ArrayList<IArea> getPath() {

		return squares;
		
	}

	public void setPath(ArrayList<IArea> path) {
		
		squares = path;

	}

	public void analyzePath() {

		for (int i = 0; i < squares.size(); i++) {

			totalEnergy += squares.get(i).getBasicEnergyCost();
			
		}

	}

	public String getAnalysis() {
		
		analyze = tostring() + Double.toString(totalEnergy);
		return analyze;
		
	}

	public void setAnalysis(String analysis) {
		
		analysis = analyze;
	}

	public String tostring() {

		return "Total Energy Cost: ";
		
	}

}
