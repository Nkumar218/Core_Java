package com.lara.Array;

import java.util.LinkedHashSet;

public class RemoveDupli 
{
	public static void duliRemove(int [] x)
	{
		int length = x.length;
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i : x)
		{
			set.add(i);
		}
		System.out.println(set);
	}
	public static void main(String[] args)
	{
		int [] x = {1, 2, 4, 6, 8, 2, 4, 6, 8, 10, 20};
		duliRemove(x);
	}
}
