package com.lara.Thread;

import java.io.*;

public class DeSerializableDemo 
{
	public static void main(String[] args)
	{
		try(FileInputStream fin = new FileInputStream("test5.ser");
				ObjectInputStream in  = new ObjectInputStream(fin))
		{
			H obj = (H) in.readObject();
			System.out.println(obj.i);
			System.out.println(obj.j);
			System.out.println(obj.k);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
/*
F()
G()
1
2
30


*/