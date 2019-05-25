package com.lara.Enum;

public class EnumDemo
{
	public enum DIRECTION
	{
		NORTH, SOUTH, EAST, WEST
	}
	public static void main(String[] args) 
	{
		for(DIRECTION dir : DIRECTION.values())	
		{
			System.out.println(dir);
		}
	}
}
