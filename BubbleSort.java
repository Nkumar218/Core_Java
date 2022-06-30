package com.app;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args) {
		int [] x = {20, 10, 15, 4, 8, 2, 18};
		System.out.println(Arrays.toString(x));
		for(int i = 0; i< x.length; i++) {
			for(int j = i+1; j< x.length; j++) {
				if(x[i]> x[j]) {
					int tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
