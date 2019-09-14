package com.lara2;

public class CompareToDemo
{
	public static void main(String[] args)
	{
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag"; 
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		
		String s11="hello";  
		String s21="";  
		String s31="me";  
		System.out.println(s11.compareTo(s21));  
		System.out.println(s21.compareTo(s31));  
	}
}
/*
if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0 

OutPut
0
-5(difference of h and m)
-1
2


5(if s1 = 5, s2 = 0, return s1 > s2 = 5.)
-2(if s2 = 0, s3 = 2, s2 < s3 = -2.)
 */