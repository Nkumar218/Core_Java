package com.lara12;

public class A 
{
	int data;
	A ref;
	static A head;
	static A tail;
	public A(int data) 
	{
		this.data = data;
	}
	public static void add(int data)
	{
		A obj= new A(data);
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
		A current = head;
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
	static boolean remove(int data)
	{
		A current = head, prev = head;
		boolean flag = false;
		if(head.data== data)
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
		A current = head, prev = head;
		int currentIndex = 0;
		int data = 0;
		if(current.data == data)
		{
			data = head.data;
			head = head.ref;
			return data;
		}
		currentIndex++;
		prev = current;
		current = current.ref;
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
	static boolean replace(int oldData, int newData)
	{
		A current = head;
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
		A current = head;
		int currentIndex = 0;
		int data = 0;
		while(current != null)
		{
			if(currentIndex == index)
			{
				data = current.data;
				current.data = newData;
				break;
			}
			current  = current.ref;
			currentIndex++;
		}
		return data;
	}
	static void swap(int fromIndex, int toIndex)
	{
		A current = head;
		int currentIndex = 0;
		A obj1 = head;
		A prevObj1 = head;
		A nextObj1 = head.ref;
		A obj2 = head;
		A prevObj2 = head;
		A nextObj2 = head;
		while(current != null)
		{
			if(currentIndex == fromIndex)
			{
				nextObj1 = current.ref;
				break;
			}
			prevObj1 = current;
			current = obj1 = current.ref;
			currentIndex++;
		}
		currentIndex = 0;
		while(current != null)
		{
			if(currentIndex == fromIndex)
			{
				nextObj2 = current.ref;
				break;
			}
			prevObj2 = current;
			current = obj2 = current.ref;
			currentIndex++;
		}
		prevObj1.ref = obj2;;
		obj2.ref = nextObj1;
		
		
		prevObj2.ref = obj1;
		obj1.ref = nextObj2;
	}
	public static void main(String[] args) {
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(60);
		add(70);
		print();
//		System.out.println(contains(20));
//		System.out.println(contains(2000));
//		System.out.println(indexOf(20));
//		System.out.println(indexOf(2000));
//		System.out.println(remove(20));
//		print();
//		System.out.println(remove(120));
//		print();
//		System.out.println(removeAtIndex(2));
//		print();
//		System.out.println(removeAtIndex(10));
//		print();
//		System.out.println(replace(20, 21));
//		print();
//		System.out.println(replace(20, 21));
//		print();
//		System.out.println(replaceAtIndex(2, 22));
//		print();
//		System.out.println(replaceAtIndex(3, 24));
//		print();
		swap(2, 4);
		print();
	}
}























