package com.lara8;

public class LinkedList1
{
	class Node
	{
		int data;
		Node ref;
	}
	private Node first;
	private Node last;
	public void add(int data)
	{
		Node node = new Node();
		node.data = data;
		if(first == null)
		{
			first =  node;
		}
		else
		{
			last.ref = node;
		}
		last = node;
	}
	public void print()
	{
		Node node= first;
		while(node != null)
		{
			System.out.print(node.data+",");
			node = node.ref;
		}
		System.out.println();
	}
	public boolean contains(int data)
	{
		Node node = first;
		boolean flag = false;
		if(first.data == data)
		{
			flag = true;
		}
		while(node != null)
		{
			if(node.data == data)
			{
				flag = true;
				break;
			}
			node = node.ref;
		}
		return flag;
	}
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(0);
		list.print();
		System.out.println(list.contains(10));
		System.out.println(list.contains(100));
	}
}

















