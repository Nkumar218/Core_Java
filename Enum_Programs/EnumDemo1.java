package com.lara.Enum;

public class EnumDemo1 
{
	enum FRUITS
	{
		MANGO, APPLE, ORANGE, LEMON, PINEAPPLE,GUAVA, GRAPES
	}
	
	private FRUITS fruits;
	private EnumDemo1(FRUITS fruit) 
	{
		this.fruits = fruit;
	}
	public void getFruits()
	{
		switch(fruits)
		{
		case GRAPES:
			System.out.println("Grapes");
			break;
		case APPLE:
			System.out.println("Apple");
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}
	public static void main(String[] args)
	{
		EnumDemo1 e1 = new EnumDemo1(FRUITS.APPLE);
		e1.getFruits();
		EnumDemo1 e2 = new EnumDemo1(FRUITS.GRAPES);
		e2.getFruits();
		EnumDemo1 e3 = new EnumDemo1(FRUITS.MANGO);
		e3.getFruits();
	}
}
