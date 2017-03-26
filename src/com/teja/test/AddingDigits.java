package com.teja.test;

public class AddingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = AddingDigits.sumOfDigits(00000);
		System.out.println(sum);
	}
	public static int sumOfDigits(int num) {
		if(num == 0)
			return 0;
		else {
			int sum = num%10;
			return sum + sumOfDigits(num/10);
		}
	}
}
