package com.lara12;

public class EquilibriumIndex
{
	public static int equiIndex(int [] x, int n)
	{
		int leftSum, rightSum;
		int i, j;
		for(i = 0; i < x.length; i++)
		{
			leftSum = 0;
			rightSum = 0;
			for(j = 0; j < i; j++)
			{
				leftSum += x[j];
			}
			for(j = i+1; j < n; j++)
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
		int [] x = {1, 2, 3, 4, 5, 1};
		int lenght = x.length;
		System.out.println(equiIndex(x, lenght));
	}
}
