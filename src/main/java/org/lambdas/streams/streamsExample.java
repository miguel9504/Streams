package org.lambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsExample {
	public static void main(String[] args) {
		//stream is a pipe where transform the data and has an output
		List<String> names = Arrays.asList("Ana", "Luis", "MariaC", "Pedro", "Juan", "Carla", "Carlos", "Carla", "Camilo", "Camila");

		List<String> newNames = names.stream()
				.filter(name -> name.contains("C")) //--> filtra por condicion --> predicate
				.sorted() //--> organiza u ordena --> comparator
				.map(String::toUpperCase) //--> transforma --> function
				.distinct() //--> elimina repetidos
				//.limit(10) //--> limita los elementos --> limit
				//.skip(3) //-->  salta elementos
				//.toList(); //--> mayor a java 19
				.collect(Collectors.toList());

		String newNames2 = newNames.stream()
				.reduce("",(a,b)-> a+b); // --> reduce o concatena

		boolean result = names.stream()
						.anyMatch(name -> names.contains("Camilo"));  //--> valida si algun valor cimple laq condicion


		boolean result2 = names.stream()
				.allMatch(name -> names.contains("m"));  //--> valida si algun valor cumple laq condicion

		boolean result3 = names.stream()
				.noneMatch(name -> name.length() > 10);  //--> valida si ningun valor cumple laq condicion

		System.out.println(newNames);
		System.out.println(newNames2);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}
}
