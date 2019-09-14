package com.lara2;

public class SplitDemo 
{
	public static void main(String[] args)
	{
		String s1="java string split method by javatpoint"; 
		String[] split = s1.split("\\s");
		for(String s2 : split)
		{
			System.out.println(s2);
		}
	}
}
/*java
string
split
method
by
javatpoint
*/