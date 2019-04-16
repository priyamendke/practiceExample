package com.app.Example;

class A {

	private void test() {
		System.out.println("Inside Private method of superclass");
	}

	public static void display() {
		System.out.println("Inside static method of superclass");
	}
}

class B extends A {
	public void show() {
		display();
	}

	/*public static void display() {
		System.out.println("Inside static method of this class");
	}*/
}

public class Demo {
	public static void main(String[] args) {
		B b = new B();
		// prints: Inside static method of this class
		b.display();

		A a = new B();
		// prints: Inside static method of superclass
		a.display();
	}
}
