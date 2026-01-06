package org.lambdas.lambdas;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable testRunnable = () -> {
			System.out.println("Executing Runnable");
		};
		testRunnable.run();
	}
}
