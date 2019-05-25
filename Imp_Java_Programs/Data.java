package com.lara12;

public class Data
{
	int data;
	Data ref;
	static Data head;
	static Data tail;
	public Data(int data)
	{
		this.data = data;// TODO Auto-generated constructor stub
	}
	static void add(int data)
	{
		Data obj = new Data(data);
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
	static void print()
	{
		Data current = head;
		while(current != null)
		{
			System.out.print(current.data+", ");
			current = current.ref;
		}
		System.out.println();
	}
	static boolean contains(int data)
	{
		Data current= head;
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
		Data current = head;
		int index = -1, occurance = -1;
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
	static boolean replace(int oldData, int newData)
	{
		Data current = head, prev = head;
		boolean flag = false;
		while(current != null)
		{
			if(current.data == oldData)
			{
				current.data = newData;
				flag = true;
			}
			current = current.ref;
		}
		return flag;
	}
	static int replaceAtIndex(int index, int newData)
	{
		Data current = head;
		int currentIndex = 0;
		int data = 0;
		while(current != null)
		{
			if(currentIndex== index)
			{
				data = current.data;
				current.data = newData;
				break;
			}
			current = current.ref;
			currentIndex++;
		}
		return data;
	}
	static boolean remove(int data)
	{
		Data current = head, prev = head;
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
	static int removeAtIndex(int index)
	{
		Data current = head, prev = head;
		int data=0;
		int currentIndex = 0;
		if(head.data == data)
		{
			data = head.data;
			head = head.ref;
			return data;
		}
		while(current != null)
		{
			if(index == currentIndex)
			{
				data = current.data;
				prev.ref = current.ref;
				break;
			}
			currentIndex++;
			prev = current;
			current = current.ref;
		}
		return data;
	}
	public static void main(String[] args) {
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(60);
		add(70);
		add(80);
		print();
//		System.out.println(contains(20));
//		System.out.println(contains(201));
//		System.out.println(indexOf(40));
//		System.out.println(indexOf(101));
//		System.out.println(replace(10, 101));
//		print();
//		System.out.println(replace(201, 20));
//		print();
//		System.out.println(replaceAtIndex(3, 401));
//		print();
//		System.out.println(replaceAtIndex(10, 401));
//		print();
//		System.out.println(remove(20));
//		print();
//		System.out.println(remove(201));
//		print();
		System.out.println(removeAtIndex(2));
		print();
		System.out.println(removeAtIndex(20));
		print();
	}
}
