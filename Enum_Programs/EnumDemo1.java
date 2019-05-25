package com.lara9;

public class EnumDemo1 
{
	enum Fruits
	{
		APPLE, ORANGE, PINEAPPLE, GUAVA, GRAPE
	}
	private Fruits fruits;
	public EnumDemo1(Fruits myfruits) 
	{
		this.fruits = myfruits;
	}
	public void getFruits()
	{
		switch (fruits) 
		{
		case APPLE:
			System.out.println("Apple is a seasonable fruits");
			break;
		case GRAPE:
			System.out.println("Grape is healthy for humen");
			break;
		case ORANGE:
			System.out.println("Orange is a jousy fruits");
			break;
		default:
			System.out.println("Not Available");
			break;
		}
	}
	public static void main(String[] args)
	{
		EnumDemo1 e1 = new EnumDemo1(Fruits.APPLE);
		e1.getFruits();
		EnumDemo1 e2 = new EnumDemo1(Fruits.GRAPE);
		e2.getFruits();
		EnumDemo1 e3 = new EnumDemo1(Fruits.GUAVA);
		e3.getFruits();
	}
}
