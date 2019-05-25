package com.lara7;

public class Test
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int cols = rows*2+2;
		for(int i = 1; i < rows; i++)
		{
			for(int j = 1; j <= 2*i+1; j++)
			{
				if(i%2 == 0 && j %2==0)
				{
					System.out.print("-");
				}
			}
			for(int j = 1; j <= 2*i; j++)
			{
				if(i%2 != 0 && j %2!=0)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
