package com.app.Example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StringBuffer {

	public static void main(String[] args) {

		List<Laptop> l = new ArrayList<Laptop>();

		l.add(new Laptop("Dell", 10000, "4GB"));
		l.add(new Laptop("HP", 25000, "8GB"));
		l.add(new Laptop("Acur", 35000, "2GB"));

		Collections.sort(l);

		for (Laptop l3 : l)
			System.out.println(l3);
	}

}
