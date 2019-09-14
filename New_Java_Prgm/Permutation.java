package com.app2;

import java.util.Scanner;

public class Permutation 
{
	public static String swap(String str, int i, int j)
	{
		char[] charArray = str.toCharArray();
		char temp;
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	private void permute(String str, int l, int r)
	{
		if (l == r) 
			System.out.println(str); 
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				permute(str, l+1, r); 
				str = swap(str,l,i); 
			} 
		} 
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st = sc.next();
		Permutation p1 = new Permutation();
		p1.permute(st, 0, st.length()-1);
	}
}
