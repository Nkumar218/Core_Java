package com.dsa;

public class InsertionPoint 
{
	public LinkedListIntersection a;
	public LinkedListIntersection b;
	public void createList()
	{
		a = new LinkedListIntersection();
		a.addAtEnd(1);
		a.addAtEnd(10);
		a.addAtEnd(20);
		Node n = a.addAtEnd(30);
		a.addAtEnd(40);
		a.addAtEnd(50);
		a.addAtEnd(60);
		System.out.println("List A :");
		a.display();
		b = new LinkedListIntersection();
		b.addAtEnd(5);
		b.addAtEnd(15);
		b.createIntersection(a, n);
		System.out.println("List B :");
		b.display();
	}
	public void findIntersectionByLeength()
	{
		int a_len = 0;
		int b_len = 0;
		int lenDiff = 0;
		boolean instFound = false;
		Node an = a.head;
		Node  bn = b.head;
		while(an != null)
		{
			an = an.next;
			a_len++;
		}
		while(bn != null)
		{
			bn = bn.next;
			b_len++;
		}
		an = a.head;
		bn = b.head;
		if(a_len > b_len)
		{
			lenDiff = a_len -b_len;
			while(lenDiff != 0)
			{
				an = an.next;
				lenDiff--;
			}
		}
		else
		{
			lenDiff = b_len - a_len;
			while(lenDiff !=0)
			{
				bn = bn.next;
				lenDiff--;
			}
		}
		while(an != null && bn != null)
		{
			if(an==bn)
			{
				System.out.println("Intersection found at : "+an.data);
				instFound = true;
				break;
			}
			else
			{
				an = an.next;
				bn = bn.next;
			}
		}
		if(instFound != true)
		{
			System.out.println("Intersection Not found");
		}
	}
	public static void main(String[] args) {
		InsertionPoint i = new InsertionPoint();
		i.createList();
		i.findIntersectionByLeength();
	}
}

/*
 * class Node { public int data; public Node next; public Node(int data) {
 * this.data = data; this.next = null; } }
 */
class LinkedListInsertion
{
	public Node head;
	public LinkedListInsertion() {
		head = null;
	}
	public Node addAtEnd(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			node.next = head;
			head = node;
		}
		else
		{
			Node currNode = head;
			while(currNode.next != null)
			{
				currNode = currNode.next;
			}
			currNode.next = node;
		}
		return node;
	}
	public void createInsertion(LinkedListIntersection a, Node nd)
	{
		Node n = a.head;
		while(n != nd)
		{
			n = n.next;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = n;
	}
	public void display()
	{
		System.out.println("");
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print("->"+currNode.data);
			currNode = currNode.next;
		}
		System.out.println("");
	}
}