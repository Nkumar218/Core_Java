package com.lara5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.lara4.FactorialCalculator;

public class CallableDemo1 
{
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		
		Random random = new Random();
		for(int i = 0; i < 4; i++)
		{
			Integer number = random.nextInt(10);
			FactorialCalculator calculator = new FactorialCalculator(number);
			Future<Integer> future = executor.submit(calculator);
			list.add(future);
		}
		for(Future<Integer> result : list)
		{
			try 
			{
				System.out.println("Future result is :"+result.get()+"; task is done :"+result.isDone());
			} 
			catch (InterruptedException | ExecutionException e) 
			{
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}
}
