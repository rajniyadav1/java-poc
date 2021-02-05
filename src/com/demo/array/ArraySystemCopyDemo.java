package com.demo.array;

enum abc{a, b, c};
public class ArraySystemCopyDemo {
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        System.out.println(copyTo);
        
        System.out.println(abc.a == abc.a);
        System.out.println(abc.a.equals(abc.a));
	}
}
