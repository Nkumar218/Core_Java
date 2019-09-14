package com.lara.Map;

import java.util.HashMap;

public class M12 
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
		A a2 = a1;
		A a3 = a2;
		map.put(a1, "abc");
		map.put(a2, "xyz");
		map.put(a3, "hello");
		System.out.println(map);
	}
}
//{(i =90)=hello}
//not reqquired override hasCode and equals method

//hasCode and equals methods working here basis on memory location

