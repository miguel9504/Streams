package org.lambdas.lambdas;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main (String[] args){
		Supplier<String> supplier = () -> "hola mundo";
		System.out.print(supplier.get());
	}
}
