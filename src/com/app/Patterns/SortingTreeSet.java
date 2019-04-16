package com.app.Patterns;


import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingTreeSet {

	public static void main(String[] args) {

		System.out.println("Tree Set");
		TreeSet<Integer> t = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);

		t.add(10);
		t.add(50);
		t.add(60);
		t.add(80);
		t.add(70);
		t.add(90);
		t.add(100);
		System.out.println("Sorting order:" + t);

		System.out.println("Tree Map");

		 TreeMap<Integer, String> t1 = new TreeMap<Integer,String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		//TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(10, "ab");
		t1.put(20, "bk");
		t1.put(40, "ac");
		t1.put(10, "lk");
		t1.put(50, "ty");
		t1.put(80, "ab");
		t1.put(15, "ab");
		t1.put(30, "ab");

		System.out.println("Sorting order:" + t1);

	}
}
