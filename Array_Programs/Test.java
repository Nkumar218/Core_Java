package com.lara.Array;

public class Test 
{
	int data;
	Test ref;
	static Test head;
	static Test tail;
	Test(int data)
	{
		this.data = data;
	}
	static void add(int data)
	{
		Test obj = new Test(data);
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
		Test current = head;
		while(current != null)
		{
			System.out.print(current.data+", ");
			current = current.ref;
		}
		System.out.println();
	}
	static boolean contains(int data)
	{
		Test current = head;
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
		Test current = head;
		int index = -1; 
		int occurance = -1;
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
		Test current = head;
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
	static boolean remove(int data)
	{
		Test current = head, prev = head;
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
	static int removeAtIndex(int index)
	{
		Test current = head, prev= head;
		int currentIndex = 0;
		int data = 0;
		if(index == currentIndex)
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
	static int replaceAtIndex(int index, int newData)
	{
		int currentIndex = 0;
		int data = 0;
		Test current = head;
		boolean flag = false;
		while(current != null)
		{
			if(currentIndex == index)
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
	public static void swap(int fromIndex, int toIndex)
	{
		Test obj1 = head;
		Test prevObj1 = head;
		Test nextObj1 = head.ref;
		
		Test obj2 = head;
		Test prevObj2 = head;
		Test nextObj2 = head;
		Test current = head;
		int currentIndex = 0;
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
		current = head;
		while(current != null)
		{
			if(currentIndex == toIndex)
			{
				nextObj2 = current.ref;
				break;
			}
			prevObj2 = current;
			current = obj2 = current.ref;
			currentIndex++;
		}
		prevObj1.ref = obj2;
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
		print();
//		System.out.println(contains(20));
//		System.out.println(indexOf(20));
//		System.out.println(replace(20, 25));
//		print();
		System.out.println(remove(20));
		print();
	}
}













