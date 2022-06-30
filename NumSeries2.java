package com.app;

public class NumSeries2 
{
	public static void main(String[] args) {
		int a = 0, b = 1, c =2;
		int d=0;
		System.out.print(a+", "+b+", "+c);
		for(int i = 0; i< 10; i++) {
			d= a+b+c;
			System.out.print(", "+d);
			a = b;
			b= c;
			c= d;
		}
	}
}
//0, 1, 2, 3, 6, 11, 20, 37, 68, 125, 230, 423, 778