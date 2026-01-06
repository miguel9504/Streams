package org.lambdas.lambdas;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class consumer {
	public static void main (String[] args){
		Consumer<ArrayList<String>> consumer = (param) -> {
			//read data and find the letter repet
			Map<String, Long> counts = param.stream()
					.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
			System.out.println(counts);
			System.out.println("Repeated letters:");
			counts.forEach((letter, count) -> {
				if (count > 1) {
					System.out.println(letter + " appears " + count + " times");
				}
			});

			System.out.println("Original list: " + param);
		};
		//poner data en un arraylist
		ArrayList<String> data = new ArrayList<>();
		data.add("e");
		data.add("l");
		data.add("e");


		consumer.accept(data);
	}
}
