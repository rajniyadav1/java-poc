package com.demo.array;

/**
 * Linear search is the simplest search algorithm and often called sequential search. 
 * In this type of searching, we simply traverse the list completely and match each element of the list with the item whose location is to be found. 
 * If the match found then location of the item is returned otherwise the algorithm return NULL or -1.
 */

public class ArrayLinearSearchDemo {
	public static void main(String[] args) {
		int[] intArray = {10, 40, 20, 30, 60, 40, 45};
		int ele = 40;
		
		int length = intArray.length;
		for(int i=0; i<length; i++) {
			if(intArray[i] == ele) {
				System.out.println("Element found at position: "+i);
				//break;	//use break if first match is found else continue matching duplicate elements
			}
		}
		
	}
}

