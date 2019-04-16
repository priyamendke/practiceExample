package com.app.Patterns;

public class Pattern8 {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= (4); i++) {
			count = i;
			for (int j = 1; j < 2 * i; j++) {

				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(count);
					count++;
				}

			}
			System.out.println("");
		}
	}

}
