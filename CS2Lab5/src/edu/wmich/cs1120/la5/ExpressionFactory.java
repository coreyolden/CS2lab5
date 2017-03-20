package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	public static IExpression getExpression(char operator, int val1, int val2) {
		IExpression left = new Literal(val1);
		IExpression right = new Literal(val2);
		if (operator=='-'){
			IOperation minus= new Subtraction();
			IExpression be = new BinaryExpression(left, right, minus);
			return be;
		}
		else{
			IOperation plus = new Addition();
			IExpression be = new BinaryExpression(left, right, plus);
			return be;
		}
		
		

		

	}
}
