package com.lara.Pattern;

public class M8
{
	public static void main(String[] args) 
	{
		int k=0;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 2*i-1; j++)
			{
				if(j%2 != 0)
				{
					k++;
					System.out.print(k);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--)
		{
			for(int j = 2*i-1; j >=1 ; j--)
			{
				if(j%2 != 0)
				{
					System.out.print(k--);
					//k--;
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
