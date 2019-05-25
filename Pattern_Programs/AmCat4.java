package com.lara.Pattern;

public class AmCat4 
{
	public static void main(String[] args)
	{
		int n=4;
		int i,j,columns=n,rows=n;
	    for(i=1; i<=rows; i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(i);
	        }
	        System.out.println();
	    }
	    for(i=1;i<=rows;i++)
	    {
	        for(j=columns;j>=i;j--)
	        {
	           System.out.print(n);
	        }
	        n--;
	        System.out.println();
	    }
	}
}
/*
1
22
333
4444
4444
333
22
1
*/