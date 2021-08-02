package com.bridgelabz.flipcoin;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	int headCount = 0, tailCount = 0, count = 0, count1 = 0;
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		FlipCoin object = new FlipCoin();
		object.coinPercentage();
	}

	/**
	 * Flips the coin, and counting the head count, tail count Returning the
	 * percentage of head and tail
	 */
	public void coinPercentage() {
		System.out.println("How many times do you want to flip the coin? ");
		int flipCount = scanner.nextInt();
		Random random = new Random();
		for (int i = 0; i < flipCount; i++) {
			int randomCheck = random.nextInt();
			if (randomCheck > 0.5) {
				headCount++;
			} else {
				tailCount++;
			}
		}
		System.out.println("Head Count is : " + headCount);
		System.out.println("Tail Count is : " + tailCount);
		System.out.println("Head Percentage is : " + calculatePercentage(flipCount, headCount)
				+ " and Tail Percentage is : " + calculatePercentage(flipCount, tailCount));
	}

	/**
	 * @param flipCount
	 * @param count
	 * @return Calculation of head percentage and tail percentage
	 */
	public int calculatePercentage(int flipCount, int count) {
		int percentage = count * 100 / flipCount;
		return percentage;
	}
}
