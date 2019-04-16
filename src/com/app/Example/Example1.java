package com.app.Example;

import org.omg.CosNaming.NamingContextPackage.CannotProceedHelper;

public class Example1 {

	public static void main(String[] args) {
		System.out.println(m1());
	}

	static int m1() {

		try {
			System.out.println("In outer try1");

			try {
				System.out.println("In Inner try2");
				System.out.println(10 / 0);

			} catch (NullPointerException a) {
				System.out.println("In Inner catch");

			} finally {
				System.out.println("Inner finally3");
				return 40;
			}
			//System.out.println("After inner try/catch/finally");
		
		} catch (NullPointerException a) {
			System.out.println("Outer catch");

		} finally {
			System.out.println("Outer finally4");

		}

		System.out.println("After outer try/catch/finally5");
		return 30;
	}
}
