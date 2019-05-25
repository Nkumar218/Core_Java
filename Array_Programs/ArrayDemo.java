package com.lara4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int[] x = new int[size];
		for(int i = 0; i <x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		System.out.println("array content:"+ Arrays.toString(x));
	}
}
