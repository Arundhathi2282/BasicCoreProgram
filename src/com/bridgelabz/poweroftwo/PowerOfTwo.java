package com.bridgelabz.poweroftwo;

import java.util.Scanner;

public class PowerOfTwo {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		PowerOfTwo object = new PowerOfTwo();
		object.powerOfTwo();
	}

	/**
	 * Printing a table of 2 powers till N
	 */
	public void powerOfTwo() {
		System.out.println("Enter a number between 0 to 31 : ");
		int N = SC.nextInt();
		if (N >= 0 && N < 31) {
			for (int i = 0; i <= N; i++) {
				System.out.println(Math.pow(2, i));
			}

		} else {
			System.out.println("Enter a valid number");
		}
	}
}
