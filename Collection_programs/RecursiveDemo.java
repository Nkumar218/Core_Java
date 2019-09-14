package com.lara5;

public class RecursiveDemo 
{
	static void print(int count)
	{
	System.out.println("print:" + count + "begin");
	count++;
	if(count <= 5)
		{
			print(count);
		}
		System.out.println("print:" + count + "end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		print(1);
		System.out.println("main end");
	}
}
