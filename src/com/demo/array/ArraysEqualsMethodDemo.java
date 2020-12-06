package com.demo.array;

import java.util.Arrays;

public class ArraysEqualsMethodDemo {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50, 60, 70};
		int[] b = {20, 30, 40, 50, 60, 70, 10};
		
		boolean areArraysEqual = false;
		
		//Sort both the arrays before checking they are equals are not
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(a.length == b.length) {
			areArraysEqual = Arrays.equals(a,  b);
		}
		
		if(areArraysEqual) {
			System.out.println("Both the arrays are equals.");
		}else {
			System.out.println("Both the arrays are not equals.");
		}
	}
}

