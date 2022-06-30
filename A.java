package com.app;

public class A //extends B
{
	final static short x = 2;
    public static int y = 0;
    public static void main(String [] args) 
    {
    	 int i = 1, j = 0; 
         switch(i) 
         { 
             case 2: j += 6; 
             case 4: j += 1; 
             default: j += 2; 
             case 0: j += 4; 
         } 
         System.out.println("j = " + j); 
    }
}
//class B extends A{
//	
//}