package com.demo.array;

import java.util.Arrays;

public class ArraysCopyDemoUsingCopyOfRange {
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
		System.out.println(copyTo);
	}

}
