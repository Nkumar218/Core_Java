package com.lara8;

import java.util.Scanner;

public class VowelCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some thing");
		String input = sc.nextLine();
		char[] letters = input.toCharArray();
		int count = 0;
		for(char c : letters)
		{
			switch (c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				//break;
			}
		}
		System.out.println("number of vowels in String "+count);
	}
}
