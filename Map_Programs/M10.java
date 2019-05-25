package com.lara.Map;

import java.util.HashMap;

public class M10 
{
	public static void main(String[] args) 
	{
		class A
		{
			int i;
			A(int i)
			{
				this.i = i;
			}
			@Override
			public String toString() 
			{
				return "(i ="+ i+")";
			}
		}
		HashMap map = new HashMap();
		map.put(new A(90), "abc");
		map.put(new A(90), "xyz");
		map.put(new A(90), "hello");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.remove(new A(90)));
		System.out.println(map);
	}
}
//{(i =90)=hello, (i =90)=abc, (i =90)=xyz}
//hasCode and equals methods working here basis on memory location