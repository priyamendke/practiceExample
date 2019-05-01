package com.app.Example;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

	public static void test(Integer ar1[], Integer ar2[]) {

		List<Integer> a1 = Arrays.asList(ar1);
		List<Integer> a2 = Arrays.asList(ar2);

		for (Integer i : a1) {

			for (Integer j : a2) {

				// if (i == j)
				if (i.equals(j)) {

					System.out.print("  " + i);
				}
			}
		}
	}

	public static void main(String[] args) {

		Integer arr1[] = { 1, 2, 3, 4, 5 };
		Integer arr2[] = { 3, 4, 5, 6, 7 };

		test(arr1, arr2);

	}

}
