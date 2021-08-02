package com.bridgelabz.largestamongthreenumbers;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int number1 = SC.nextInt();
		int number2 = SC.nextInt();
		int number3 = SC.nextInt();
		LargestAmongThreeNumbers object = new LargestAmongThreeNumbers();
		System.out.println(object.largestNumber(number1, number2, number3));
	}

	/**
	 * Finding large number among three given numbers
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int largestNumber(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}
}
