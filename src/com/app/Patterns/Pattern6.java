package com.app.Patterns;

//import java.lang.*;
import java.io.*;

public class Pattern6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i, j, a = 1;
		System.out.print("Enter N value:");
		n = Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.print((a++) + "*");
			}
			System.out.println(a++);
		}
	}

}
