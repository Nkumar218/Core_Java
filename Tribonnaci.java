package com.app;

public class Tribonnaci 
{
	public static void main(String[] args) {
		int a = 0, b = 1, c=2, d = 0;
		System.out.print(a+" "+b+" "+c);
		for(int i = 0; i<10; i++) {
			d = a+b+c;
			System.out.print(" "+d);
			a = b;
			b = c;
			c = d;
		}
	}
}
