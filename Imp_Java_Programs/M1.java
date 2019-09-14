package com.lara10;
class Hello
{
	void show()
	{
		System.out.println("Show()");
	}
}
public class M1
{
	public static void main(String[] args)
	{
		Hello h1 = new Hello();
		h1.show();
		new Hello().show();
		System.out.println("=========");
		Hello h2 = null;
		h2.show();//java.lang.NullPointerException
	}
}
