package com.app;

import java.util.Scanner;

public class HighestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer");
		String num = sc.next();
		char [] ch1 = num.toCharArray();
		for(int i = 0; i< ch1.length; i++) {
			for(int j = i+1; j < ch1.length; j++) {
				if(ch1[i] < ch1[j]) {
					char tmp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = tmp;
				}
			}
		}
		System.out.println(ch1);
	}
}
