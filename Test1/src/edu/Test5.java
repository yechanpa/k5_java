package edu;

public class Test5 {

	public static void main(String[] args) {

		int A1 = 10;
		int A2 = 20;
		int A3 = A1 + A2;
		A2 += 10;
		System.out.println(A3);
		System.out.println(A2);
		char gender = 'M';
		int balance = 100;
		System.out.println(!(gender != 'F') || & balance > 10);
	}

}
