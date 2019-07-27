package com.dsa;

import java.util.HashMap;

public class RemoveDuplFromLinkedList 
{
	public Node removedup(Node head)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if(head == null)
		{
			return null;
		}
		Node currNode = head.next;
		Node prevNode = head;
		Node temp;
		map.put(head.data, 1);
		while(currNode != null)
		{
			int data = currNode.data;
			if(map.containsKey(data))
			{
				prevNode.next = currNode.next;
				temp = currNode;
				currNode = currNode.next;
				temp.next = null;
			}
			else
			{
				map.put(data, 1);
				prevNode = currNode;
				currNode=currNode.next;
			}
		}
		return head;
	}
	public void display(Node head)
	{
		Node node = head;
		while(node != null)
		{
			System.out.print("->"+node.data);
			node = node.next;
		}
	}
	public static void main(String[] args) {
		Node n = new Node(2);
		n.next = new Node(2);
		n.next.next = new Node(2);
		n.next.next.next = new Node(4);
		n.next.next.next.next = new Node(4);
		n.next.next.next.next.next = new Node(5);
		System.out.println("Original List");
		RemoveDuplFromLinkedList r = new RemoveDuplFromLinkedList();
		r.display(n);
		System.out.print("\n Updated List: "); 
		Node x =r.removedup(n); 
		r.display(x);
	}
}
