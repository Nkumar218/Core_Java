package com.lara2;

public class M7 
{
	static int x;
	public static void main(String[] args) 
	{
		int x =20;
		System.out.println(x);//20
		System.out.println(M7.x);//0
		x =30;
		M7.x = 40;
		System.out.println(x);//30
		System.out.println(M7.x);//40
	}
}
