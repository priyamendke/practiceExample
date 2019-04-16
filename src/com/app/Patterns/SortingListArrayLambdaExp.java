package com.app.Patterns;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListArrayLambdaExp {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(15);
		l.add(80);
		l.add(20);
		l.add(90);
		l.add(100);
		l.add(30);
		l.add(10);
		l.add(5);

		System.out.println("Before Sorting order:       " + l);

		Collections.sort(l);
		System.out.println("After Accending Sort order: " + l);

		Collections.sort(l, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		System.out.println("After Decending Sort order: " + l);

	}

}
