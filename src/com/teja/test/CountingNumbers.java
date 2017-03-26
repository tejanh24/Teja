package com.teja.test;

public class CountingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfDigits = CountingNumbers.countDigits(1234567890);
		System.out.println(noOfDigits);
	}
	
	public static int countDigits(int num) {
		if(num/10 == 0)
			return 1;
		else {
			int count = 1;
			return count + countDigits(num/10);
		}
	}

}
