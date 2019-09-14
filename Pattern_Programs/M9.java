package com.lara.Pattern;

import java.util.Scanner;

public class M9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        for (int i = 2; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }  
            System.out.println();
        }
	}
}