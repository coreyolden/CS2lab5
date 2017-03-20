package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
private IOperation op;
private IExpression left;
private IExpression right;
	public BinaryExpression(IExpression l, IExpression r, IOperation operation){
		op=operation;
		left = l;
		right = r;
	}
	public Integer getValue() {
		int seekthis=op.perform(left, right);
		return seekthis;
		
	}

}
