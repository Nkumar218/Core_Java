package com.lara9;

import java.util.Scanner;

public class RecursiveFactorial 
{
	public static int isFactorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return (num * isFactorial(num-1));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		int num = sc.nextInt();
		int fact = 1;
		fact = isFactorial(num);
		System.out.println(fact);
	}
}
