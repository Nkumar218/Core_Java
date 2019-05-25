package com.lara7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableDemo implements Callable<String>
{
	@Override
	public String call() throws Exception
	{
		Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
	}
	public static void main(String[] args)
	{
		ExecutorService exe = Executors.newFixedThreadPool(10);
		List<Future<String>> list= new ArrayList<>();
		Callable<String> callable= new CallableDemo();
		for(int i = 0; i < 10; i++)
		{
			Future<String> future = exe.submit(callable);
			list.add(future);
		}
		for(Future<String> fut : list)
		{
			try
			{
				System.out.println(new Date()+" :"+fut.get());
			}
			catch(InterruptedException | ExecutionException e)
			{
				e.printStackTrace();
			}
		}
		exe.shutdown();
	}
}
