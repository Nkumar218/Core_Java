package com.lara.Pattern;

public class AmCat6
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j == 1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
	}
}
/*
12222
23333
34444
45555
56666
*/