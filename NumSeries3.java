package com.app;

public class NumSeries3 
{
	public static void main(String[] args) {
		int a = 0, b = 1, c = 2, d = 3, e=0;
		System.out.print(a+", "+b+", "+c+", "+d);
		for(int i = 0; i< 5; i++) {
			e = a+b+c+d;
			System.out.print(", "+e);
			a=b;
			b= c;
			c=d;
			d=e;
		}
	}
}
