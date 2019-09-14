package com.lara.Array;

public class EquilibriumIndex 
{
	public static int equiIndex(int [] x, int num)
	{
		int leftSum;
		int rightSum;
		int i , j;
		for(i = 0; i < num; i++)
		{
			leftSum = 0;
			rightSum = 0;
			for(j = 0; j < i; j++)
			{
				leftSum += x[j];
			}
			for(j = i+1; j < num; j++)
			{
				rightSum += x[j];
			}
			if(leftSum == rightSum)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int [] x = { 2, 4, 1, 6, 4, 1,2};
		int length = x.length;
		System.out.println(equiIndex(x, length));
	}
}
