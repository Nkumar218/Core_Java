package com.lara.Pattern;

public class AmCat7
{
	public static long lcm(int [] x)
	{
		int lcmArray = 1;
		int divisor = 2;
		while(true)
		{
			int counter = 0;
			boolean divisible = false;
			for(int i = 0; i < x.length; i++)
			{
				if(x[i] == 0)
				{
					return 0;
				}
				if(x[i] < 0)
				{
					x[i] = x[i]*(-1);  
				}
				if(x[i]== 1)
				{
					counter++;
				}
				if(x[i]% divisor == 0)
				{
					divisible = true;
					x[i] = x[i]/divisor;
				}
			}
			if(divisible)
			{
				lcmArray = lcmArray * divisor; 
			}
			else
			{
				divisor++;
			}
			if(counter == x.length)
			{
				return lcmArray;
			}
		}
	}
	public static void main(String[] args)
	{
		int [] array = {2, 7, 3, 9, 4};
		System.out.println(lcm(array));
	}
}
