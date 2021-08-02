package com.bridgelabz.evenorodd;

import java.util.Scanner;

public class EvenOrOdd {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		int Number = SC.nextInt();
		EvenOrOdd object = new EvenOrOdd();
		System.out.println(object.numberChecking(Number));
	}

	/**
	 * Checking the number is Even or Odd
	 * 
	 * @param Number
	 * @return
	 */
	public String numberChecking(int Number) {
		if (Number % 2 == 0) {
			return "Even Number";
		} else {
			return "Odd Number";
		}
	}
}
