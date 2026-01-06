package org.lambdas.lambdas;

import java.util.concurrent.Callable;

public class CallableExample {
	public static void main(String[] args) {
		Callable<String> callableExample = () -> "Test Callable result";

		try{
			String result = callableExample.call();
			System.out.println(result);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
