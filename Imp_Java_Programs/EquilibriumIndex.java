package com.lara10;

public class EquilibriumIndex
{
	int equilibrium(int [] arr, int num)
	{
		int i, j;
		int leftSum, rightSum;
		for(i = 0; i < num; ++i)
		{
			leftSum = 0;
			rightSum = 0;
			for(j = 0; j < i; j++)
			{
				leftSum += arr[j];
			}
			for(j = i + 1; j < num; j++)
			{
				rightSum += arr[j];
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
		EquilibriumIndex e1 = new EquilibriumIndex();
		int arr[]  = {-7, 1, 5, 2, -4, 3, 0};
		int size = arr.length;
		System.out.println(e1.equilibrium(arr, size));
	}
}
