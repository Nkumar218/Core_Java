package com.lara10;

public class ListIndex
{
	public int equilibrium(int [] array, int num)
	{
		int i, j;
		int leftSum;
		int rightSum;
		for(i = 0; i < num; i++)
		{
			leftSum = 0;
			rightSum = 0;
			for(j = 0; j < i; j++)
			{
				leftSum += array[j];
			}
			for(j = i+1; j < num; j++)
			{
				rightSum += array[j];
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
		ListIndex list = new ListIndex();
		int [] x = {1, 3,1, 0, 2, 3};
		int length = x.length;
		System.out.println(list.equilibrium(x, length));
	}
}
