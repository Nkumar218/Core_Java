package com.lara.Map;

import java.util.HashMap;

public class M13 {
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
			@Override
			public int hashCode()
			{
				return Integer.toString(i).hashCode();
			}
			@Override
			public boolean equals(Object obj) 
			{
				return (obj instanceof A) && i == ((A)obj).i;
			}
		}
		HashMap map = new HashMap();
		A a1 = new A(90);
		A a2 = new A(90);
		A a3 = new A(90);
		map.put(a1, "abc");
		map.put(a2, "xyz");
		map.put(a3, "hello");
		System.out.println(map);
	}
}
//{(i =90)=hello}
//hasCode and equals methods working here basis on memory location
//HashMap is identifying very easily.
//
