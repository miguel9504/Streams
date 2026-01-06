package org.lambdas.lambdas;

import java.util.function.Consumer;

public class BiConsumer {
	public static void main (String[] args){
		java.util.function.BiConsumer<String, String> biConsumer = (a, b) -> System.out.print(a + b);
		biConsumer.accept("hola ","mundo");
	}
}
