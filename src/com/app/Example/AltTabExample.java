package com.app.Example;

import java.util.Scanner;

public class AltTabExample {

	public static void main(String[] args) {
		int n, m, i, j, temp;
		int arr[] = new int[50];
		Scanner scan = new Scanner(System.in);

		System.out.print("Sorting tabs using Sorting Techniques...\n");

		System.out.print("Enter Open Number of Tabs : ");
		n = scan.nextInt();

		System.out.print("Enter " + n + " Tab Numbers : ");
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.print("Enter one Number of above numbers : ");
		m = scan.nextInt();
		System.out.print("This is sequence of open tabs : ");

		if (m == arr[i]) {
 
			System.out.println(m + " " + arr[i]);

		} //Incomplete program 
	}
}
