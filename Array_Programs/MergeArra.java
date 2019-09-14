package com.lara.Array;

import java.util.Arrays;

public class MergeArra 
{
	public static void main(String[] args)
	{
		int [] x1 = {10, 20, 30, 40};
		int [] x2 = {5, 15, 25, 35};
		int [] x = merge(x1, x2);
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+", ");
		}
		System.out.println("\n"+Arrays.toString(x));
	}
	public static int [] merge(int [] x1, int [] x2)
	{
		int length1= x1.length;
		int length2 = x2.length;
		int [] x3 = new int[length1+length2];
		int i = 0, j = 0;
		for(int  k = 0; k < x3.length; k++)
		{
			if(i >= length1)
			{
				x3[k] = x2[j];
				j++;
			}
			else if(j >= length2)
			{
				x3[k] = x1[i];
				i++;
			}
			else
			{
				if(x1[i] < x2[j])
				{
					x3[k] = x1[i];
					i++;
				}
				else
				{
					x3[k] = x2[j];
					j++;
				}
			}
		}
		return x3;
	}
}
