package com.lara.Thread;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayLambda 
{
	public static void main(String[] args)
	{
	    int[] months = {10, 24, 12, 26, 40, 25};
	    System.out.println(Arrays.toString(months)); //printing before
	   // Arrays.sort(months, Comparator.comparingInt(String::length))
	    Arrays.sort(months);
	 System.out.println(Arrays.toString(months)); //printing after
	}
}