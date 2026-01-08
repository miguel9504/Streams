package org.lambdas.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		//crear arraylist
		List<String> colorList = new ArrayList<>();

		//crear objetos de tipo arraylist
		String[] names = {"Ana", "Luis", "MariaC", "Pedro", "Juan", "Carla", "Carlos", "Carla", "Camilo", "Camila"};

		List<String> namesList = Arrays.asList(names);

		//Adicion de elementos individuales
		colorList.add("Blue");
		colorList.add("Red");
		colorList.add("Green");

		List<String> elements = new ArrayList<>(colorList);
		elements.addAll(namesList);
		//System.out.println(elements);
		List<List<Integer>> matrix = Arrays.asList(
				Arrays.asList(1,2,3,5,9), //0,3   // 0,4  //0,0
				Arrays.asList(7,9,0,6,1), //1,2   // 1,3  //1,1
				Arrays.asList(7,1,7,8,4), //2,1  // 2,2    //2,2
				Arrays.asList(5,9,1,5,1), //3,0  // 3,1    //3,3
				Arrays.asList(4,7,3,9,9)          // 4,0   //4,4
		);

		List<String> matrixWords = Arrays.asList("ate","eat","tea","ala","laa","meet");


		//System.out.println(diagonalDifference(matrix));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int diagonalL = 0;
		int diagonalR = 0;
		for(int i = 0; i< arr.size(); i++){
			for (int j = 0; j < arr.get(i).size() ; j++) {
				if(i == j){
					diagonalL = diagonalL + arr.get(i).get(j);
					if(i + j == (arr.size() - 1)){
						diagonalR = diagonalR + arr.get(i).get(j);
					}
				}else if (i + j == (arr.size() - 1) ){
					diagonalR = diagonalR + arr.get(i).get(j);
				}
			}
		}
		return Math.abs(diagonalR - diagonalL);
	}

	public static List<List<String>> anagram(List<String> lWords) {

		lWords =

		return new ArrayList<>(new ArrayList<>());
	}
}