package com.app.Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("golu");
	}

}
