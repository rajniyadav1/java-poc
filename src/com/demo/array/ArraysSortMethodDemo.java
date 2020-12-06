package com.demo.array;

import java.util.Arrays;

public class ArraysSortMethodDemo {

	public static void main(String[] args) {
		int[] arr = {56, 78, 90, 96, 100, 16, 19, 20, 23, 45};
		
		System.out.println("Arrays before sorting: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arrays after sorting: "+ Arrays.toString(arr));
	}
}
