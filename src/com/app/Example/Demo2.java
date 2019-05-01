package com.app.Example;

class A1 {

	void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
	}
}

class B1 extends A1 {

	void m1() {
		System.out.println("B m1");
	}

	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}
}

class C extends B1 {

	void m2() {
		System.out.println("C m2");
		//m4();
	}

}

public class Demo2 extends C {

	void m1() {
		System.out.println("D m1");
	}

	void m2() {
		System.out.println("D m2");
	}

	void m4() {
		System.out.println("D M4");
	}

	public static void main(String[] args) {

		Demo2 de = new Demo2();
		de.m1();
		de.m2();
		de.m3();
		de.m4();

	}

}
