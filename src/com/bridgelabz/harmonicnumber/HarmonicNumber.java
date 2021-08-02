package com.bridgelabz.harmonicnumber;

import java.util.Scanner;

public class HarmonicNumber {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		HarmonicNumber object = new HarmonicNumber();
		object.harmonicNumber();
	}

	/**
	 * Printing the Harmonic number series and it's result
	 */
	public void harmonicNumber() {
		System.out.println("Enter a number : ");
		int N = SC.nextInt();
		double num = 0;
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				System.out.print("1/" + i);
				if (i < N) {
					System.out.print(" + ");
				}
			}
		} else {
			System.out.println("Enter a valid Number");
		}
		for (double i = 1; i <= N; i++) {
			num = num + 1 / i;
		}
		System.out.println();
		System.out.println(" Result of Harmonic Number is : " + num);
	}
}
