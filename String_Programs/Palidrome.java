package com.lara8;

import java.util.Scanner;

public class Palidrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in); 
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int rem, rev=0;
		int num1 = num;
		while(num > 0)
		{
			rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
		}
		if(rev == num1)
		{
			System.out.println("Entered Number is palidrome");
		}
		else
		{
			System.out.println("Entered Number is not a palidrome");
		}
	}
}
