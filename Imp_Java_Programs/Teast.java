package com.lara12;

import java.util.Scanner;

public class Teast 
{
	//static Scanner s;
	public static void main(String[] args) {
	System.out.println("Enter a double number:");
	Scanner s = new Scanner(System.in);
	double n=s.nextDouble();
	roundOff(n);
	}
	public static void roundOff(double k) {
		int m=(int) (k+0.5);
		System.out.println(m);
	}
}
