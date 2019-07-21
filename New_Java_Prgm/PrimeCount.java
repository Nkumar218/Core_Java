package com.app2;

public class PrimeCount 
{
	public static void main(String[] args) {
		int i =0, j=0;
		String primeNumber="";
		for(i = 1; i <= 100; i++)
		{
			int counter = 0;
			for(j = i; j >=1; j--)
			{
				if(i%j == 0)
				{
					counter = counter+1;
				}
			}
			if(counter==2)
			{
				primeNumber = primeNumber+i+" ";
			}
		}
		System.out.print(primeNumber);
	}
}
