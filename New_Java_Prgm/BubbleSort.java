package com.app2;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] x = {2, 18, 4, 10, 20, 39, 0};
		System.out.println(Arrays.toString(x));
		for(int i = 0; i< x.length; i++)
		{
			for(int j = i+1; j < x.length; j++)
			{
				if(x[i] > x[j])
				{
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
