package com.lara12;

import java.util.Arrays;

public class MergeTwoArray
{
	public static int[] merge(int [] x1, int [] x2)
	{
		int lenght1 = x1.length;
		int length2 = x2.length;
		int [] result = new int[lenght1+ length2];
		int i = 0, j = 0;
		for(int k = 0; k < result.length; k++)
		{
			if(i >= lenght1)
			{
				result[k]= x2[j];
				j++;
			}
			else if(j >= length2)
			{
				result[k] = x1[i];
				i++;
			}
			else
			{
				if(x1[i] < x2[j])
				{
					result[k] = x1[i];
					i++;
				}
				else
				{
					result[k]= x2[j];
					j++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		int [] a = {10, 20, 30, 40};
		int [] b = {15, 25, 35, 45};
		int [] c = merge(a, b);
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+", ");
		}
		System.out.println("\n"+Arrays.toString(c));
	}
}














