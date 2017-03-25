package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * perform subtracts the left and right expression to return an integer.
	 * 
	 * @param left
	 * @param right
	 * @return Integer
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {

		Integer leftNum = left.getValue();
		Integer rightNum = right.getValue();

		return leftNum - rightNum;

	}

}
