package com.code.test;

import java.util.Arrays;
import java.util.Scanner;

public class TempleProblem {
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
		long size;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		size = s.nextLong();
		long price[] = new long[(int) size];
		int n = price.length;
		for (int i = 0; i < n; i++) {
			price[i] = s.nextInt();
		}
		System.out.println(minCost(price, n));
	}
}
