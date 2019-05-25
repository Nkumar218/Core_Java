package com.lara.String;
import java.util.Scanner;
public class StringReverse
{
	static String reverse(String s)
	{
		for(int i = s.length()-1; i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}
		return s;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter String");
		String s1 = sc.nextLine();
		reverse(s1);
	}
}
