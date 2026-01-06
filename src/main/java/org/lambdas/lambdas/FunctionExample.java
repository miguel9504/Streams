package org.lambdas.lambdas;

import java.util.function.Function;

public class FunctionExample {
	public static void main (String[] args){
		Function<String, String> data = (a) -> a.toUpperCase();
		System.out.print(data.apply("test"));
	}
}