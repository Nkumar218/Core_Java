package com.lara12;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstRepeatedChar 
{
	static Character repeatCahr(String s1)
	{
		char [] ch1 = s1.toCharArray();
		 HashSet<Character> set = new HashSet<>(); 
		for(int i = 0; i < ch1.length; i++){
			char ch2 = ch1[i];
			if(set.contains(ch2))
			{
				return ch2;
			}
			else
			{
				set.add(ch2);
			}
		}
		return '\0';
	}
	public static void main(String[] args) {
		String str = "geeksforgeeks"; 
        System.out.println(repeatCahr(str));
        
        String str1 = "HelloAll"; 
        System.out.println(repeatCahr(str1));
	}
}
