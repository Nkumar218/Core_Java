package com.lara7;

public class DoublyLinkedList1
{
	class Node
	{
		int data;
		Node next;
		Node prev;
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
			last.prev = first;
			last.next = node;
		}
		last = node;
	}
	public void read()
	{
		Node node = first;
		while(node != null)
		{
			System.out.print(node.data+", ");
			node = node.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		DoublyLinkedList1 list = new DoublyLinkedList1();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.read();
	}
}





















