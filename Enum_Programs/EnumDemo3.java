package com.lara.Enum;

public class EnumDemo3 
{
	enum FRUIT
	{
		GRAPES
		{
			public String toString()
			{
				return "Grapes is seasonal fruits and goood for health";
			}
		},
		APPLE
		{
			public String toString()
			{
				return "Apple is seasonal fruits and goood for health";
			}
		},
		ORANGE
		{
			public String toString()
			{
				return "Orange is seasonal fruits and goood for health";
			}
		},
		PAPAYA
		{
			public String toString()
			{
				return "Papaya is all time fruits and goood for health";
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(FRUIT.APPLE);
		System.out.println(FRUIT.ORANGE);
	}
}
