package com.lara12;

import java.util.Scanner;

public class MaxPossibleInteger 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[j] > ch[i])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
	}
}
