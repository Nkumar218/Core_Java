
package com.lara.Pattern;

public class M11 
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 7/2+1; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i = 7/2; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
