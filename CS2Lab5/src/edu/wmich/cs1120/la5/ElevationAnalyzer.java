
/**This is messed up somewhere. It prints but I dont know if it's in the way that he wants.
 * 
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	String analyze;
	double avgElevation = 0;
	ArrayList<IArea> squares = new ArrayList<IArea>();

	public ArrayList<IArea> getPath() {

		return squares;
	}

	public void setPath(ArrayList<IArea> path) {

		squares = path;

	}

	public void analyzePath() {

		for (int i = 0; i < squares.size(); i++) {

			avgElevation += squares.get(i).getElevation();

		}

		avgElevation = (avgElevation / squares.size());

	}

	public String getAnalysis() {

		analyze = tostring() + Double.toString(avgElevation);
		return analyze;

	}

	public void setAnalysis(String analysis) {

		analysis = analyze;
		
	}

	public String tostring() {

		return "Average Elevation: ";
	}

}
