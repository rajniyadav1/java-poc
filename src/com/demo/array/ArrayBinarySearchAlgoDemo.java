package com.demo.array;

public class ArrayBinarySearchAlgoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
		 int item = 23;
		 int location = -1;
		 
		 location = binarySearch(arr, 0, 9, item);
		 if(location != -1) {
			 System.out.println("Element found at location: "+location);
		 }else {
			 System.out.println("Element not found");
		 }
	}
	
	public static int binarySearch(int[] arr, int beg, int end, int item) {
		int mid;
		if(end >= beg) {
			mid = (beg + end) / 2;
			if(arr[mid] == item) {
				return mid;
			}else if(arr[mid] < item) {
				return binarySearch(arr, mid+1, end, item);
			}else {
				return binarySearch(arr, beg, mid-1, item);
			}
		}
		return -1;
	}

}
