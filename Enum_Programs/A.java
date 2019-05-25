package com.lara9;

public class A 
{
	int data;
	A ref;
	static A head;
	static A tail;
	A(int data)
	{
		this.data = data;
	}
	public static void add(int data)
	{
		A obj = new A(data);
		if(head == null)
		{
			head = obj;
			tail = obj;
		}
		else
		{
			tail.ref = obj;
			tail = tail.ref;
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
	public static void swap(int fromIndex, int toIndex)
	{
		A current = head;
		int currentInt = 0;
		
		A obj1 = head;
		A prevObj1 = head;
		A nextObj1 = head.ref;
		
		A obj2 = head;
		A prevObj2 = head;
		A nextObj2 = head;
		while(current != null)
		{
			if(currentInt == fromIndex)
			{
				nextObj1 = current.ref;
				break;
			}
			prevObj1 = current;
			current = obj1 = current.ref;
			currentInt++;
		}
		currentInt = 0;
		current = head;
		while(current != null)
		{
			if(currentInt == toIndex)
			{
				nextObj2 = current.ref;
				break;
			}
			prevObj2 = current;
			current = obj2 = current.ref;
			currentInt++;
		}
		prevObj1.ref = obj2;
		obj2.ref = nextObj1;
		
		prevObj2.ref = obj1;
		obj1.ref = nextObj2;
	}
	static boolean replace(int fromData, int newData)
	{
		A current = head;
		boolean flag = false;
		while(current != null)
		{
			if(current.data == fromData)
			{
				current.data = newData;
				flag= true;
			}
			current = current.ref;
		}
		return flag;
	}
	static boolean remove(int data)
	{
		A current = head, prev = head;
		boolean flag = false;
		if(head.data == data)
		{
			head.data = data;
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
	public static void main(String[] args)
	{
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(70);
		add(60);
		print();
		//swap(2, 4);
		System.out.println(replace(20, 25));
		print();
		System.out.println(remove(25));
		print();
	}
}













