package com.teja.algorithms;

import java.util.Scanner;

public class MergeSort {
	int array[];
	int tempArray[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  size = 0;
		int[] array;
		System.out.println("Enter the size you want to sort");
		size = sc.nextInt();
		array = new int[size];
		System.out.println("Enter " + size + " elements in and unsorted order");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		MergeSort m = new MergeSort();
		m.sort(array);
		m.display();
	}
	
	public void sort(int array[]) {
		this.array = array;
		int count = 0;
		tempArray = new int[array.length];
		count = doMergeSort(0,array.length-1);
		System.out.println(count);
	}
	
	public int doMergeSort(int low,int high) {
		int count = 0;
		if (low < high) {
			int mid = (low + high)/2;
			count+= doMergeSort(low,mid);
			count+= doMergeSort(mid+1,high);
			count+= merge(low,mid,high);
		}
		return count;
	}
	
	public int merge(int low,int mid, int high) {
		System.out.println(low + " " + mid + " " + high);
		int i = low;
		int j = mid+1;
		int k = low;
		int count = 0;
		for(int n=low; n <= high; n++) {
			tempArray[n] = array[n];
			System.out.println(tempArray[n]);
		}
		System.out.println("=================");
		while(i <= mid && j<=high) {
			if(tempArray[i] < tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			}
			else {
				array[k] = tempArray[j];
				count = count + mid - i + 1;
				j++;
			}
			k++;
		}
		while(i<=mid) {
			array[k] = tempArray[i];
			i++;
			k++;
		}
		//System.out.println("Number of Split Inversions " + count);
		return count;
	}
	
	public void display() {
		//System.out.println("Number of Split Inversions " + noOfSplitInversions);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}

}
