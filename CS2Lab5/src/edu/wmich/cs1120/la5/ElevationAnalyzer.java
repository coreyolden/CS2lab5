
/**This is messed up somewhere. It prints but I dont know if it's in the way that he wants.
 * 
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
String analyze;
double TotalElevation=0;
	ArrayList<IArea> squares = new ArrayList<IArea>();
	public ArrayList<IArea> getPath() {
		
		return squares;
	}

	
	public void setPath(ArrayList<IArea> path) {
		squares = path;
		
	}

	
	public void analyzePath() {
		
		for (int i=0; i<squares.size(); i++){
		
		TotalElevation +=squares.get(i).getElevation();
		}
		
		
	}

	
	public String getAnalysis() {
		analyze = tostring() + Double.toString(TotalElevation);
		return analyze;
	}

	
	public void setAnalysis(String analysis) {
	
		
	}

	
	public String tostring() {
		
		return "Total Elevation: ";
	}

}
