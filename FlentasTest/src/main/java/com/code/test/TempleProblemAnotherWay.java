package com.code.test;

import java.util.Arrays;
import java.util.Scanner;

public class TempleProblemAnotherWay {
	static long minCost(long price[], int n) {

		Arrays.sort(price);

		long totalCost = 0;

		for (int i = n - 1; i > 1; i -= 2) {
			if (i == 2) {
				totalCost += price[2] + price[0];
			} else {

				long price_first = price[i] + price[0] + 2 * price[1];
				long price_second = price[i] + price[i - 1] + 2 * price[0];
				totalCost += Math.min(price_first, price_second);
			}
		}

		if (n == 1) {
			totalCost += price[0];
		} else {
			totalCost += price[1];
		}

		return totalCost;
	}

	public static void main(String[] args) {
		long price1[] = { 300, 400, 600, 700 };
		long price2[] = { 1321, 2450 };
		long price3[] = { 500, 123, 873 };
		long price4[] = { 600, 800, 150, 700 };
		int n1 = price1.length;
		int n2 = price2.length;
		int n3 = price3.length;
		int n4 = price4.length;

		System.out.println("1st Case: " + minCost(price1, n1));
		System.out.println("2st Case: " + minCost(price2, n2));
		System.out.println("3st Case: " + minCost(price3, n3));
		System.out.println("4st Case: " + minCost(price4, n4));
	}
}
