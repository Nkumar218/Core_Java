package com.lara8;

public class DoubleLinkedLisst 
{
	class Node 
	{
		int data;
		Node prev;
		Node next;
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
			last = node;
		}
		else
		{
			last.next = node;
			node.prev = last;
		}
		last = node;
	}
	public void printAsc()
	{
		Node node= first;
		while(node != null)
		{
			System.out.print(node.data+",");
			node = node.next;
		}
		System.out.println();
	}
	public void printDesc()
	{
		Node node= last;
		while(node != null)
		{
			System.out.print(node.data+",");
			node = node.prev;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DoubleLinkedLisst list = new DoubleLinkedLisst();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(0);
		list.printAsc();
		System.out.println("=================");
		list.printDesc();
	}
}


