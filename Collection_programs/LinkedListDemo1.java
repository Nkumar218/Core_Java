package com.lara7;

public class LinkedListDemo1
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
			first = node;
		}
		else
		{
			last.ref = node;
		}
		last = node;
	}
	public void iterate()
	{
		Node node = first;
		while(node != null)
		{
			System.out.print(node.data+",");
			node = node.ref;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		LinkedListDemo1 list = new LinkedListDemo1();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.iterate();
	}
}












