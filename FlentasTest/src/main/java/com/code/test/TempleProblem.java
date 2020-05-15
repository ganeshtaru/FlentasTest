package com.code.test;

import java.util.Arrays;
import java.util.Scanner;

public class TempleProblem {
	static long minCost(long cost[], int n) {

		Arrays.sort(cost);

		long totalCost = 0;

		for (int i = n - 1; i > 1; i -= 2) {
			if (i == 2) {
				totalCost += cost[2] + cost[0];
			} else {

				long cost1 = cost[i] + cost[0] + 2 * cost[1];
				long cost2 = cost[i] + cost[i - 1] + 2 * cost[0];
				totalCost += Math.min(cost1, cost2);
			}
		}

		if (n == 1) {
			totalCost += cost[0];
		} else {
			totalCost += cost[1];
		}

		return totalCost;
	}

	public static void main(String[] args) {
		long size;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		size = s.nextLong();
		long cost[] = new long[(int) size];
		int n = cost.length;
		for (int i = 0; i < n; i++) {
			cost[i] = s.nextInt();
		}
		System.out.println(minCost(cost, n));
	}
}
