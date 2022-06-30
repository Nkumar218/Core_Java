package com.app;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void isAnagram(String s1, String s2) {
		String st1 = s1.replaceAll("\\s", "");
		String st2 = s2.replaceAll("\\s", "");
		boolean flag = true;
		if(s1.length() != s2.length()) {
			flag = false;
		}
		else {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag = Arrays.equals(c1, c2);
		}
		if(flag) {
			System.out.println(s1+" and "+s2+" are Anagram");
		}
		else {
			System.out.println(s1+" and "+s2+" are not Anagram");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s1 = sc.next();
		String s2 = sc.next();
		isAnagram(s1, s2);
	}
}
