package com.app;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount 
{
	public static void charCount(String str) {
		char []c = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c1 :c) {
			if(map.containsKey(c1)) {
				map.put(c1, map.get(c1)+1);
			}
			else {
				map.put(c1, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String words = sc.next();
		charCount(words);
	}
}
