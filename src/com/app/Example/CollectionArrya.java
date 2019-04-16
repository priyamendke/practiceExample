package com.app.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionArrya {
	public static void main(String args[]) {
//		String a[] = { "P", "A", "W" };
//		String b[] = { "A", "N" };
		Integer a[] = { 1, 8, 6, 9 };
		Integer b[] = { 7, 9, 8, 3 };

		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}
