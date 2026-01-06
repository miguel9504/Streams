package org.lambdas.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main (String[] args){
		UnaryOperator<Integer> unaryOperatorExample = (a) -> a * a ;
		int result = unaryOperatorExample.apply(200);
		System.out.print(result);
	}
}
