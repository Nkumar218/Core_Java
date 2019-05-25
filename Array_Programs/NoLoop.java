package com.lara.Array;

public class NoLoop
{
	  static int count;
   public static void repeat(String s)
   {
	   while(count <= 10)
	   {
		   System.out.println(s);
		   count++;
	   }
   }
   public static void main(String[] args)
   {
	   	repeat("hello");
   }
}