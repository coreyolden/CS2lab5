/**This isnt completed because I ran into problems with the other step.
 * 
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	ArrayList<IArea> squares = new ArrayList<IArea>();
	public ArrayList<IArea> getPath() {
		
		return squares;
	}

	
	public void setPath(ArrayList<IArea> path) {
		squares = path;
		
	}

	
	public void analyzePath() {
		// TODO Auto-generated method stub
		
	}

	
	public String getAnalysis() {
		
		return null;
	}

	
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		
	}

	
	public String tostring() {
		// TODO Auto-generated method stub
		return analyze;
	}

}
