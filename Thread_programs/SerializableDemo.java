package com.lara.Thread;

import java.io.*;

class F
{
	int i;
	F()
	{
		i = 1; //second time
		System.out.println("F()");
	}
}
class G extends F
{
	int j;
	G()
	{
		j =  2;//second time
		System.out.println("G()");
	}
}
class H extends G implements Serializable
{
	int k;
	H()
	{
		System.out.println("H()");
	}
}
public class SerializableDemo 
{
	public static void main(String[] args) 
	{
		try(FileOutputStream fout = new FileOutputStream("test5.ser");
				ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			H h1 = new H();
			h1.i = 10;
			h1.j = 20;
			h1.k = 30;
			out.writeObject(h1);
			System.out.println("done");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
