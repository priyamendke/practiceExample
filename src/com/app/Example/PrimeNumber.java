package com.app.Example;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 7;
		int temp = 0;

		/*
		 * for (int i = 2; i <= n; i++) { if (n / i == 0) {
		 * System.out.println("Not Prime number");
		 * 
		 * } else { System.out.println(" Prime number"); }
		 */

		for (int i = 2; i <= n; i++) {
			if (n / i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {

			System.out.println("Not Prime number");
		} else {
			System.out.println(" Prime number");
		}

	}

}
