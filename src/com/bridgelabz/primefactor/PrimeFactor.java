package com.bridgelabz.primefactor;

import java.util.Scanner;

public class PrimeFactor {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		PrimeFactor object = new PrimeFactor();
		object.factros();
	}

	/**
	 * Prime Factors of a give integer
	 */
	public void factros() {
		System.out.println("Enter a number : ");
		int N = SC.nextInt();
		if (N % 2 == 0) {
			System.out.println(2);
			N = N / 2;
		}
		for (int i = 3; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
				N = N / i;
			}
		}
	}
}
