package org.lambdas.lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
	//receive a value and return a boolean
	public static void main (String[] args){
		Predicate<Integer> data = (a) -> a > 2;
		System.out.print(data.test(2));
	}
}
