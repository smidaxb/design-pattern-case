package main.action.interpreter.code;

import java.util.HashMap;

/**
 * 抽象类表达式，通过hashMap键值对，可以获取到变量的值
 * 
 * @author Administrator
 *
 */
public abstract class Expression {
	// a + b - c
	// 解释公式和数值，key是参数abc，value是具体值
	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
