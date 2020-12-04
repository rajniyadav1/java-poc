package com.demo.array;

import java.util.Arrays;

/**
 * creates an array of integers, puts some values in the array, and prints each value to standard output.
 * @author ADMIN
 *
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// declares an array of integers
		int[] anArray;
		
		anArray = new int[10];
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;
		
		System.out.println("Array elements are: " + Arrays.toString(anArray));
	}

}
