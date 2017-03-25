package edu.wmich.cs1120.la5;

public class Literal implements IExpression {

	/**
	 * value holds the value of the val1 in the method Literal()
	 */
	private int value = 0;

	/**
	 * Literal sets the private field value equal to the parameter val1
	 * 
	 * @param val1
	 */
	public Literal(int val1) {

		value = val1;

	}

	/**
	 * getValue returns the private field value
	 */
	public Integer getValue() {

		return value;

	}

}
