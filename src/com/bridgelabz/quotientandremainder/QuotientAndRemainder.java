package com.bridgelabz.quotientandremainder;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Numerator part : ");
		int numerator = scanner.nextInt();
		System.out.println("Enter Denominator part : ");
		int denominator = scanner.nextInt();
		double quotient = numerator / denominator;
		System.out.println("Quotient : " + quotient);
		int Remainder = numerator % denominator;
		System.out.println("Remainder : " + Remainder);
	}
}
