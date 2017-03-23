package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {

	String analyze;
	double TotalRadiation = 0;
	ArrayList<IArea> squares = new ArrayList<IArea>();

	
	public ArrayList<IArea> getPath() {

		return squares;
		
	}

	public void setPath(ArrayList<IArea> path) {
		
		squares = path;

	}

	public void analyzePath() {

		for (int i = 0; i < squares.size(); i++) {

			TotalRadiation += squares.get(i).getRadiation();
			
		}

	}

	public String getAnalysis() {
		
		analyze = tostring() + Double.toString(TotalRadiation);
		return analyze;
		
	}

	public void setAnalysis(String analysis) {
		
		analysis = analyze;
		
	}

	public String tostring() {

		return "Total Radiation: ";
		
	}

}
