package com.app.EncodeDecode;

import org.apache.commons.codec.binary.Base64;

public class Test {

	public static void main(String[] args) {
		String s = "Welcome to Pawan Home";
		System.out.println("Real String          :-" + s);

		byte[] a = s.getBytes();
		byte[] b = Base64.encodeBase64(a);
		String s1 = new String(b);
		System.out.println("Encoded String       :-" + s1);

		byte[] c = s1.getBytes();
		byte[] d = Base64.decodeBase64(c);
		String s2 = new String(d);
		System.out.println("After Decoded String :-" + s2);

	}

}