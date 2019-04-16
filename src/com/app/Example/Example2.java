package com.app.Example;

public class Example2 {

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
				return 20;
			}
			// System.out.println("After inner try/catch/finally4");
			// return 10;

		} catch (ArithmeticException a) {
			System.out.println("Outer catch4");

		} finally {
			System.out.println("Outer finally5");
			// return 30;

		}

		System.out.println("After outer try/catch/finally6");
		return 30;
	}

}
