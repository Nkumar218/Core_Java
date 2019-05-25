package com.lara8;

public class Point 
{
	private final int x;
	private final int y;
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object o)
	{
		return o instanceof Point;
	}
	public static void main(String[] args)
	{
		Point a = new Point(1, 2);
		Point b = new Point(1, 2);
		System.out.println(a.equals(b));
	}
}
