package com.app.Patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		/*
		 * if (i1 > i2) { return -1;
		 * 
		 * } else if (i1 < i2) { return +1;
		 * 
		 * } else { return 0; }
		 */

		// this is ternary operator we use below lines
		return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;
	}

}

public class SortingListArray {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(15);
		l.add(80);
		l.add(20);
		l.add(90);
		l.add(30);
		l.add(10);
		l.add(5);
		
		System.out.println("Before Sorting order:       " + l);

		Collections.sort(l);
		System.out.println("After Accending Sort order: " + l);

		Collections.sort(l, new MyComparator());
		System.out.println("After Decending Sort order: " + l);

	}

}
