package com.app.Patterns;

public class Pattern3 {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 0; k <= 4; k++) {

			for (int l = 3; l >= k; l--) {

				System.out.print("*");
			}
			System.out.println();

		}
	}
}
