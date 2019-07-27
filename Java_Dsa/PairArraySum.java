package com.dsa;

import java.util.HashSet;

public class PairArraySum 
{
	static void printitems(int [] array, int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++)
		{
			int temp = sum - array[i];
			if(s.contains(temp))
			{
				System.out.println("Pair element of geven sum "+sum+" is ("+ array[i]+", "+temp+")");
			}
			s.add(array[i]);
		}
	}
	public static void main(String[] args) {
		int [] x = {2, 6, 8, 12, 15, 3, 20};
		int n = 18;
		printitems(x, n);
	}
}
