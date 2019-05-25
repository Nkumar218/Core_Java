package com.lara.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class M23 {
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
		//Comparator c1 =(o1, o2)-> ((A)o1).i - ((A)o2).i;
		TreeMap map = new TreeMap((o1, o2)-> ((A)o1).i - ((A)o2).i);
		map.put(new A(90),"abc");
		map.put(new A(9),"abc");
		map.put(new A(0),"abc");
		System.out.println(map);
	}
}

/*
{(i =0)=abc, (i =9)=abc, (i =90)=abc}

*/
