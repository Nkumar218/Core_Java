package com.lara.Map;

import java.util.TreeMap;

public class M19 
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
				return "(i ="+i+")";
			}
			@Override
			public int hashCode() 
			{
				return Integer.toString(i).hashCode();
			}
			@Override
			public boolean equals(Object obj) 
			{
				return (obj instanceof A) && (i == ((A)obj).i);
			}
		}
		TreeMap map = new TreeMap();
		map.put(new A(90),"abc");
		map.put(new A(9),"abc");
		map.put(new A(0),"abc");
		System.out.println(map);
	}
}
/*
Exception in thread "main" java.lang.ClassCastException: com.lara.Map.M19$1A cannot be cast to java.lang.Comparable
at java.util.TreeMap.compare(Unknown Source)
at java.util.TreeMap.put(Unknown Source)
at com.lara.Map.M19.main(M19.java:33)

*/