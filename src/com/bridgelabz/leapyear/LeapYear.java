package com.bridgelabz.leapyear;

import java.util.Scanner;

public class LeapYear {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a year : ");
		int leapYear = scanner.nextInt();
		year(leapYear);
	}

	/**
	 * Checking the year is leap year or not
	 * @param leapYear
	 */
	public static void year(int leapYear) {
		if (leapYear % 4 == 0 || leapYear % 100 != 0 && leapYear % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}
