package com.teja.test;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Factorial.factorial(5);
		System.out.println(result);
	}
	
	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		else {
			return num * factorial(num-1);
		}
	}
}
