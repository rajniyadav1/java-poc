package com.demo.array;

public class MultidimensionalArray {
	public static void main(String[] args) {
		String names[][] = {{"Mr. ", "Mrs. ", "Ms. "},
				{"Smith", "Jones"}
		};
		
		System.out.println("First element of multidimensional array is: " + names[0][0] + names[1][0]);
		System.out.println("Second element of multidimensional array is: " + names[0][1] + names[1][1]);
	}
}
