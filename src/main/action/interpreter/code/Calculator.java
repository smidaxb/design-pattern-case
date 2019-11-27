package main.action.interpreter.code;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	// 定义表达式
	private Expression expression;

	// 构造函数传参，并解析
	public Calculator(String expStr) { // expStr = a+b
		// 安排运算先后顺序
		Stack<Expression> stack = new Stack<>();
		// 将表达式拆分为字符数组
		char[] charArray = expStr.toCharArray();// [a, +, b]

		Expression left = null;
		Expression right = null;
		//遍历字符数组，如 [a, +, b]
		//针对不同情况做处理
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': //
				left = stack.pop();// 从stack取出left => "a"
				right = new VarExpression(String.valueOf(charArray[++i]));//取出右边表达式"b"
				stack.push(new AddExpression(left, right));// 将a+b的结果入栈
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				//如果是一个var，就创建varExpression对象，并push到stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//表达式最后剩下的数字便是最终解
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		//最后将a+b和var  = {a=10,b=20}
		//然后传递给expression的interpreter进行解释执行
		return this.expression.interpreter(var);
	}
}