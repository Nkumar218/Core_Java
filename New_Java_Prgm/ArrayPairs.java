package com.app2;

import java.util.HashSet;

public class ArrayPairs {
	static void printpair(int [] x, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i< x.length; i++)
		{
			int temp = sum - x[i];
			if(set.contains(temp))
			{
				System.out.println("Pair with given sum "+sum+" is ("+x[i]+", "+temp+")");
			}
			set.add(x[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {4, 8, 10, 2, 3, 9, 16};
		int n = 12;
		printpair(arr, n);
	}
}
