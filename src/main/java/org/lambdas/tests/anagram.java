package org.lambdas.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class anagram {
	public static void main(String[] args) {
		//List<String> anagram = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		List<String> anagram = List.of("eat", "tea", "tan", "ate", "nat", "bat");

//		ArrayList<List<String>> result = new ArrayList<>(
//				anagram.stream()
//						.collect(Collectors.groupingBy(s -> {
//							char[] chars = s.toCharArray();
//							System.out.println(chars);
//							Arrays.sort(chars);
//							return new String(chars);
//						})
//						)
//						.values());

		ArrayList<List<String>> result;
			result = new ArrayList<List<String>>( anagram.stream()
						.collect(Collectors.groupingBy(s -> {
									char[] chars = s.toCharArray();
									System.out.println(chars);
									Arrays.sort(chars);
									return new String(chars);
								})
						).values());


		System.out.println(result);
	}
}
