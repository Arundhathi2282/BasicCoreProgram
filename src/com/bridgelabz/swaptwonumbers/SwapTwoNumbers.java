package com.bridgelabz.swaptwonumbers;

import java.util.Scanner;

public class SwapTwoNumbers {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 1st number :");
		int n = SC.nextInt();
		System.out.println("Enter 2nd number :");
		int m = SC.nextInt();
		SwapTwoNumbers object = new SwapTwoNumbers();
		object.operation(n, m);
	}

	/**
	 * @param n
	 * @param m 
	 * Swapping two Numbers
	 */
	public void operation(int n, int m) {
		n = n + m;
		m = n - m;
		n = n - m;
		System.out.println("After swap the 1st number is : " + n);
		System.out.println("After swap the 2nd number is : " + m);
	}
}
