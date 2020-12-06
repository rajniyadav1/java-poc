package com.demo.array;

import java.util.Arrays;

public class ArraysEqualsUsingIterativeDemo {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
        
        //sort both the arrays if the arrays elements are not at the same index
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean bothAreEquals = true;
        
        //Check the length of both the arrays and compare it
        if(arr1.length == arr2.length) {
        	for(int i=0; i< arr1.length; i++) {
        		if(arr1[i] != arr2[i]) {
        			bothAreEquals = false;
        		}
        	}	
        }else {
        	bothAreEquals = false;
        }
        
        if(bothAreEquals) {
        	System.out.println("Both the arrays are equals");
        }else {
        	System.out.println("Both the arrays are not equals");
        }
	}
}

