package com.lara.Pattern;

import java.util.Scanner;

public class AmCatPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int n = sc.nextInt();
		int columns,rows;
	    int pat1=1,pat2=(n*n)+1;
	    columns=n;
	    rows=n;
	    for(int i = 1; i <= rows; i++)
	    {
	    	for(int j = 1; j < i ; j++)
	    	{
	    		System.out.print(i);
	    	}
	    	System.out.println();
	    }
	}
}
