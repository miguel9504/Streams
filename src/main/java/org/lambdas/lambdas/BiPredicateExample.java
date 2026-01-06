package org.lambdas.lambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
	public static void main (String[] args){
		BiPredicate<Integer, Integer> biPredicateEx = (a,b) -> (a + b) >= 2;
		System.out.print(biPredicateEx.test(2,0));
	}
}
