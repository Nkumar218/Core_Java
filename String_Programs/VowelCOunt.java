package com.lara.String;

import java.util.Scanner;

public class VowelCOunt
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char [] c = s1.toCharArray();
		int count = 0;
		for(char c1 : c)
		{
			switch (c1)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
			}
		}
		System.out.println("No of vowels in String :"+count);
	}
}
