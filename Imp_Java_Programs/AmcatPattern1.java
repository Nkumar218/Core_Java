package com.lara12;

import java.util.Scanner;

public class AmcatPattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		for(int i = 1; i <= rows; i++)
		{
			int k = i;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(k+" ");
				k = k+rows-j;
			}
			System.out.println();
		}
	}
}

/*Enter rows
5
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
*/