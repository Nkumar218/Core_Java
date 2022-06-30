package com.app;

import java.util.Scanner;

public class LongestChar {
	public static void find(String s) {
		if(s == null || s.length()==0)
			return;
		int maxCount = 1;
		int currCount = 1;
		char maxChar = s.charAt(0);
		char currChar = s.charAt(0);
		for(int i = 0; i < s.length();i++) {
			currChar = s.charAt(i);
			currCount=1;
			for(int j = i+1; j<s.length(); j++) {
				if(currChar==s.charAt(j)) {
					currCount++;
					if(currCount> maxCount) {
						maxCount = currCount;
						maxChar = currChar;
					}
				}
				else {
					break;
				}
			}
		}
		System.out.println("Inputs: "+s+" character :"+maxChar+" and Count is: "+maxCount);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings");
		String  str = sc.next();
		find(str);
	}
}
