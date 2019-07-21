package com.app2;

public class AddSpace 
{
	public static void addSpace(String s)
	{
		char[]c = s.toCharArray();
		for(int i =0; i<c.length;i++)
		{
			if(c[i]>= 'A' && c[i]<='Z')
			{
				c[i] = (char)(c[i]+32);
				if(i!=0)
				{
					System.out.print(" ");
				}
				System.out.print(c[i]);
			}
			else
			{
				System.out.print(c[i]);
			}
		}
	}
	public static void main(String[] args) {
		String s = "MyNameIsNiranjan";
		addSpace(s);
	}
}
