package com.app;

public class StringRev {
	public static void main(String[] args) {
		String str = "Sony is going to introduce Internet TV soon";
		System.out.println("Original String: " + str);

		//reversed string using Stringbuffer
		String reverseStr = new StringBuffer(str).reverse().toString();
		System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

		//iterative method to reverse String in Java
		reverseStr = reverseRecursively(str);
		System.out.println("Reverse String in Java using Recursion: " + reverseStr);
	}

	public static String reverseRecursively(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}
}
