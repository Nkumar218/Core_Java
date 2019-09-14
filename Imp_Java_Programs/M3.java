package com.lara10;
class Hello1
{
	int a;
	static int b;
	void show()//static void show()// error in a becose of non static variable
	{
		System.out.println(a);//0
		System.out.println(b);//0
	}
}
public class M3
{
	public static void main(String[] args)
	{
		Hello1 h1 = new Hello1();
		h1.show();
	}
}
