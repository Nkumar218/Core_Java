package com.lara5;

public class Looping 
{
	static int count;
	static void print()
	{
		count++;
		if(count <=20){
		System.out.println("hello->"+count);
		print();
	}
	}
	public static void main(String[] args) 
	{
		print();
	}
}
//stackOverflowException