package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	/**
	 * getExpression gets the expression to be sent to either class that
	 * implements the IOperation interface. Then this getExpression returns the
	 * value of the binary expression.
	 * 
	 * @param operator
	 * @param val1
	 * @param val2
	 * @return be
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {

		IExpression left = new Literal(val1);
		IExpression right = new Literal(val2);

		if (operator == '-') {

			IOperation minus = new Subtraction();
			IExpression be = new BinaryExpression(left, right, minus);
			return be;

		} else {

			IOperation plus = new Addition();
			IExpression be = new BinaryExpression(left, right, plus);
			return be;

		}

	}

}
