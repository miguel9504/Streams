package org.lambdas.lambdas;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BinaryExample {
	public static void main (String[] args){
		BinaryOperator<Integer> binaryOperatorExample = (a, b) -> a + b;
		System.out.print(binaryOperatorExample.apply(2,7));
	}
}
