package org.lambdas.tests;

import java.util.*;

public class palindrome {
	public static void main(String[] args) {

		//validar si una palabra o frase es un palindromo
		//validar cuantas aplidromas hay en un array
		// validar las anagramas

		System.out.println(isPalindroime("vavav"));
	}

	public static boolean isPalindroime (String text) {

		String clText = text.replaceAll("[a-zA-Z0-9]","").toLowerCase();
		String invertedText = new StringBuilder(clText).reverse().toString();
		return clText.equals(invertedText);
	}

	public static boolean isPalindromeTwoPointers(String text) {

		String clText = text.replaceAll("[a-zA-Z0-9]","").toLowerCase();
		int left = 0;
		int rigth = clText.length() - 1;

		while (left < rigth){
			if(clText.charAt(left) != clText.charAt(rigth)){
				return false;
			}
			left ++;
			rigth --;
		}
		return true;
	}

}
