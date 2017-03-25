package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	/**
	 * op performs addition or subtraction on the binary expression
	 */
	private IOperation op;

	/**
	 * left is the value of the left IExpression to be added or subtracted
	 */
	private IExpression left;

	/**
	 * right is the value of the right IExpression to be added or subtracted
	 */
	private IExpression right;

	/**
	 * this constructor sets the values of the parameters to the respective
	 * private fields.
	 * 
	 * @param l
	 * @param r
	 * @param operation
	 */
	public BinaryExpression(IExpression l, IExpression r, IOperation operation) {

		op = operation;
		left = l;
		right = r;

	}

	/**
	 * getValue returns an Integer value that is the result of the operation
	 * 
	 * @return seekthis
	 */
	public Integer getValue() {

		int seekthis = op.perform(left, right);
		return seekthis;

	}

}
