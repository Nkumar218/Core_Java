package com.lara.Array;

public class A1 
{
	public static int findIndex(int [] x1, int n)
	{
		if(x1 == null)
		{
			return -1;
		}
		int len = x1.length;
		int i = 0;
		while(i < len)
		{
			if(x1[i] == n)
				return i;
			else
				 i = i+1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int [] array = {10, 20, 14, 15, 25, 30};
		System.out.println(findIndex(array, 20));
		System.out.println(findIndex(array, 15));
		System.out.println();
	}
}
/*
1
3

*/