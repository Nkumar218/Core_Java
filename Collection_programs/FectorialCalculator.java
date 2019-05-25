package com.lara5;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FectorialCalculator implements Callable<Integer>
{
	private Integer number;
	
	FectorialCalculator(Integer number)
	{
		this.number = number;
	}
	@Override
	public Integer call() throws Exception
	{
		int result = 1;
		if((number == 0) || (number == 1))
		{
			result = 1;
		}
		else
		{
			for(int i = 2; i < number; i++)
			{
				result *= i;
				TimeUnit.MILLISECONDS.sleep(20);
			}
		}
		System.out.println("Result for Number:"+number+"->"+result);
		return result;
	}
}
