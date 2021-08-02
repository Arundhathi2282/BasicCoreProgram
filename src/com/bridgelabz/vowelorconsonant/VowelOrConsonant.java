package com.bridgelabz.vowelorconsonant;

import java.util.Scanner;

public class VowelOrConsonant {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter an Alphabet :");
		char alphabet = SC.next().charAt(0);
		VowelOrConsonant object = new VowelOrConsonant();
		System.out.println(object.method(alphabet));
	}

	/**
	 * returning an alphabet as a vowel or consonant
	 * 
	 * @param alphabet
	 * @return
	 */
	public String method(char alphabet) {
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			return "Vowel";
		} else {
			return "Consonant";
		}
	}
}
