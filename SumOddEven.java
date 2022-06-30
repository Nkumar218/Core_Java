package com.app;

import java.util.Scanner;

public class SumOddEven 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many number inputs");
		int num, a, s1 = 0, s2 =0;
		num = sc.nextInt();
		System.out.println("Enter the numbers");
	//	a = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			a = sc.nextInt();
			if(a%2 ==0) {
				s1 = s1+a;
			}
			else {
				s2 = s2+a;
			}
		}
		System.out.println("Sum of Even Number : "+s1);
		System.out.println("Sum of Odd Number : "+s2);
	}
}
