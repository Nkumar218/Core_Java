package com.lara12;

import java.util.Scanner;

public class AmcatPattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		for(int i = 0; i < rows; i++)
		{
			for(int j= 0; j <= rows; j++)
			{
				if(i % 2 == 0)
				{
					if(j == rows)
					{
						System.out.print(i+2);
					}
					else
					{
						System.out.print(i+1);
					}
				}
				else if(i%2 != 0)
				{
					if(j== 0)
					{
						System.out.print(i+2);
					}
					else
					{
						System.out.print(i+1);
					}
				}
			}
			System.out.println();
		}
	}
}

/*Enter rows
6
1111112
3222222
3333334
5444444
5555556
7666666

*/