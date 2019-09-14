package com.lara.Map;

import java.util.TreeMap;

public class M20 {
	public static void main(String[] args) 
	{
		class A implements Comparable
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
			@Override
			public int compareTo(Object o) 
			{
				return i - ((A)o).i;
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
{(i =0)=abc, (i =9)=abc, (i =90)=abc}

*/