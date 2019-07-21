package com.app2;

import java.util.Scanner;

public class ReverseWord 
{
	public void reverse(String s)
	{
		String [] word = s.split(" ");
		String rev = "";
		for(int i=0; i< word.length;i++)
		{
			String words = word[i];
			String revword = "";
			for(int j=words.length()-1; j>=0; j--)
			{
				revword =revword+ words.charAt(j);
			}
			rev = rev + revword+" ";
		}
		System.out.println(s);
		System.out.println(rev);

	}
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string");
//		String st = sc.next();
		ReverseWord r = new ReverseWord();
		r.reverse("Hello to welcome");
	}
}
