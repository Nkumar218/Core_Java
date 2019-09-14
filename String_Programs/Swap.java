package com.lara8;

import java.util.Scanner;

public class Swap
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		System.out.println("Before Swaping X :"+x);
		System.out.println("Before Swaping Y :"+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swaping X:"+x);
		System.out.println("After Swaping Y:"+y);
	}
}
