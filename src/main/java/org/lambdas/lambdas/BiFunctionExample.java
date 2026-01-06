package org.lambdas.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
	public static void main (String[] args){
		BiFunction<String, String, String> data = (a,b) -> (a+b).toUpperCase();
		System.out.print(data.apply("testasdasd","Test2"));
	}
}
