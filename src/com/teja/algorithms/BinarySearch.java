package com.teja.algorithms;

import java.util.Scanner;

public class BinarySearch {
	//boolean flag = false;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100000000];
		for(int i=1;i <= 100000000; i++) {
			a[i-1] = i;	
		}
		System.out.println("Enter key to search");
		int key = sc.nextInt();
		long startTime = System.currentTimeMillis();
		new Search().search(a,key);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}

class Search {
	int array[];
	public void search(int a[],int key) {
		this.array = a;
		if(a.length < 1 ) {
			System.out.println("Not found");
		}
		else if(a.length == 1) {
			if(a[0] == key) {
				System.out.println("The key is at 1st pos");
			}
			else {
				System.out.println("Not found");
			}
		}
		else {
			binarySearch(0,a.length-1,key);
		}
	}
	public void binarySearch(int low,int high,int key) {

			int mid = (low + high) / 2;
			if( high < low) 
				System.out.println("Not Found");
			else if(array[mid] == key) {
				System.out.println("Found at " + (mid+1));
				//flag = true;
			}
			else if(array[mid] > key) {
				binarySearch(low,mid-1,key);
			}
			else if(array[mid] < key) {
				binarySearch(mid+1,high,key);
			}
		}
}

