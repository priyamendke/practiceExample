package com.app.Example;

public class ArrayList1 {

	public static void main(String[] args) {

		int arr[] = new int[10];

		java.util.ArrayList<Integer> a1 = new java.util.ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);

		java.util.ArrayList<Integer> a2 = new java.util.ArrayList<>();
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		a2.add(7);

		if (a1.equals(a2)) {

			System.out.print("  " + a1);

		}

	}
}
