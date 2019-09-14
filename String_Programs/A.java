package com.lara8;

public class A 
{
	int data;
	A ref;
	static A head;
	public A(int data) 
	{
		this.data = data;
	}
	public static void add(int data)
	{
		A obj = new A(data);
		if(head == null)
		{
			head = obj;
		}
		else
		{
			A lastRef = head;
			while(lastRef.ref != null)
			{
				lastRef = lastRef.ref;
			}
			lastRef.ref = obj;
		}
	}
	public static void print()
	{
		A current = head;
		while(current != null)
		{
			System.out.print(current.data+", ");
			current = current.ref;
		}
		System.out.println();
	}
	static boolean remove(int data)
	{
		A current = head, prev = head;
		boolean flag = false;
		if(head.data == data)
		{
			head = head.ref;
			flag = true;
		}
		while(current != null)
		{
			if(current.data == data)
			{
				prev.ref = current.ref;
				flag = true;
			}
			prev = current;
			current = current.ref;
		}
		return flag;
	}
	static boolean contains(int data)
	{
		A current = head;
		boolean flag = false;
		while(current != null)
		{
			if(current.data == data)
			{
				flag = true;
				break;
			}
			current = current.ref;
		}
		return flag;
	}
	static int indexOf(int data)
	{
		int index = -1;
		int occurance = -1;
		A current = head;
		boolean flag = false;
		while(current != null)
		{
			index++;
			if(current.data == data)
			{
				flag = true;
				break;
			}
			current = current.ref;
		}
		if(! flag)
		{
			index = occurance;
		}
		return index;
	}
	static boolean replace(int from, int to)
	{
		A current  = head;
		boolean flag = false;
		while(current != null)
		{
			if(current.data == from)
			{
				current.data = to;
				flag = true;
			}
			current = current.ref;
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		print();
		System.out.println(remove(40));
		print();
		System.out.println(contains(10));
		System.out.println(contains(40));
		System.out.println(replace(10, 41));
		print();
	}
}
