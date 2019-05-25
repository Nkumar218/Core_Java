package com.lara.Map;

import java.util.HashMap;

public class M11 
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
		A a1 = new A(90);
		map.put(a1, "abc");
		map.put(a1, "xyz");
		map.put(a1, "hello");
		System.out.println(map);
	}
}
//{(i =90)=hello}

//hasCode and equals methods working here basis on memory location
