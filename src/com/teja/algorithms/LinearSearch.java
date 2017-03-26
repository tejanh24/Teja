package com.teja.algorithms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		int a[] = new int[100000000];
		for(int i = 1; i <= 100000000; i++) {
			a[i-1] = i;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search");
		int key = sc.nextInt();
		long startTime = System.currentTimeMillis();
		LinearSearch.search(a,key);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	public static void search(int a[],int key) {
		int len = a.length;
		boolean flag = false;
		for(int i=0;i<len-1;i++) {
			if(a[i] == key) {
				System.out.println("Found at " + (i+1));
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Not Found");
		}
	}
}
