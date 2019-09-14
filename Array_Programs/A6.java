package com.lara.Array;

public class A6 
{
	public int equilibrium(int [] x, int num)
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
		int [] x = {10, 20, 30, 18, 12};
		int length = x.length;
		A6 a1 = new A6();
		System.out.println(a1.equilibrium(x, length));
	}
}










