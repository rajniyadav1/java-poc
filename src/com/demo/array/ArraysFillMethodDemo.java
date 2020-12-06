package com.demo.array;

import java.util.Arrays;

public class ArraysFillMethodDemo {

	public static void main(String[] args) {
		int a[] = new int[6];
		Arrays.fill(a, 50);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.fill(a, 2, 6, 20);
		System.out.println(Arrays.toString(a));
	}
}

