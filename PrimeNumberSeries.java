package com.app;

import java.util.Scanner;

public class PrimeNumberSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Prime number 1 to 100 are ");
		int c;
		for (int i = 1; i <= 100; i++) {
			c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2)
				System.out.print(i + " ");
		}
	}
}
