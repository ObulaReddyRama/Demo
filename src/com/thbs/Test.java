package com.thbs;

public class Test {

	public static void main(String[] args) {

		System.out.println("welcome to Git");
		m(10);
		print("rama");

		println(1);
		
		
		dontPrint();

	}

	private static void dontPrint() {
		//not printing...
		
	}

	private static void println(int i) {
		System.out.println(i);
		
	}

	private static void print(String string) {
		System.out.println(string);
	}

	private static void m(int i) {
		System.out.println(i);
	}

}
