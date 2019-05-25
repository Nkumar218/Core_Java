package com.lara8;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String s1 = sc.nextLine();
		char[] c1 = s1.toCharArray();
		int size = c1.length;
		for(int i = 0; i < size/2; i++)
		{
			char temp = c1[i];
			c1[i] = c1[size - i -1];
			c1[size - i -1] = temp;
		}
		System.out.println(c1);
	}
}
