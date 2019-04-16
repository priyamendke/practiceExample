package com.app.Patterns;

public class Pattern7 {

	public static void main(String[] args) {

		int a=1, n=4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print((a++) + "*");
			}
			System.out.println(a++);
		}

	}

}
