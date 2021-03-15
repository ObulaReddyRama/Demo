package com.thbs;

public class Test {

	public static void main(String[] args) {

		System.out.println("welcome to Git");
		m(10);
		print("rama");
		println("rama",10);

	}

	private static void println(String string, int i) {
		System.out.println(string+""+i);
		
	}

	private static void print(String string) {
		System.out.println(string);
	}

	private static void m(int i) {
		System.out.println(i);
	}

}
