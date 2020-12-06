package com.demo.array;

import java.util.Arrays;

public class ArraysBinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10, 40, 11, 35, 14, 11, 30};
		System.out.println("Integer array elements are: "+Arrays.toString(intArray));
		int i = 11;
		Arrays.sort(intArray);
		System.out.println("Integer array elements after sorting are: "+Arrays.toString(intArray));
		System.out.println("Binary search of i is: "+Arrays.binarySearch(intArray, i));	
	}

}
