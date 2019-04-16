package com.app.Example;

public class Example {

	static void m1(int a) {

		System.out.println("int-arg");
	}

	static void m1(Integer a) {

		System.out.println("Integer-arg");
	}

	/*static void m1(long a) {

		System.out.println("long-arg");
	}
*/
	/*static void m1(Character a) {

		System.out.println("Character-arg");
	}*/

	/*static void m1(Number a) {

		System.out.println("Number-arg");
	}*/

	static void m1(Boolean a) {

		System.out.println("Boolean-arg");
	}

	/*static void m1(Object a) {

		System.out.println("Object-arg");
	}*/

	public static void main(String[] args) {
		m1(50);
		m1('a');
		m1(new Integer(20));
		m1(new Character('b'));
		//m1(new Long(400));
		//m1(50.45);
		m1(true);

	}

}
