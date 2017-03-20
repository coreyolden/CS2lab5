package edu.wmich.cs1120.la5;

public class Literal implements IExpression{
private int value=0;
	
	
	
	public Literal(int val1) {
		value=val1;
	}
	
	public Integer getValue() {
		
		return value;
		
	}
	
	

}
