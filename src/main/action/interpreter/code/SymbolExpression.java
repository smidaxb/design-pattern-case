package main.action.interpreter.code;

import java.util.HashMap;

/**
 * 抽象运算解释器，每个运算符只和自己左右两个数字有关
 * 左右两个数字也可能是一个解析结果，无论何种类型，均为Expression类的实现类
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//子类实现，此处为默认实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}
}
