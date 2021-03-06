package com.lara9;

public class MergeArray 
{
	public static void main(String[] args) 
	{
		int [] array1 = {10, 20, 30, 31};
		int [] array2 = {15, 25, 35, 40};
		int [] result = merge(array1, array2);
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i]+", ");
		}
	}
	public static int[] merge(int [] x1, int [] x2)
	{
		int length1 = x1.length;
		int length2 = x1.length;
		int result[] = new int[length1 + length2];
		int i = 0, j= 0;
		for(int k = 0; k < (length1+length2); k++)
		{
			if(i >= length1)
			{
				result[k] = x2[j];
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
					result[k] = x2[j];
					j++;
				}
			}
		}
		return result;
	}
}
