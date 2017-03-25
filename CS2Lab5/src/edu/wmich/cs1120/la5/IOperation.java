package edu.wmich.cs1120.la5;

public interface IOperation {
	
	/**
	 * @param left
	 * @param right
	 * @return Integer
	 */
	Integer perform(IExpression left, IExpression right);
	
}
