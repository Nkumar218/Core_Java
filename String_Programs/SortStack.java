package com.lara8;

import java.util.Stack;

public class SortStack 
{
	public static Stack<Integer> sort(Stack<Integer> input)
	{
		Stack<Integer> st = new Stack<>();
		while(! input.isEmpty())
		{
			int temp = input.pop();
			while(! st.isEmpty() && st.peek() > temp)
			{
				input.push(st.pop());
			}
			st.push(temp);
			System.out.println("input :"+temp);
			System.out.println("Stack :"+st);
		}
		return st;
	}
	public static void main(String[] args)
	{
		Stack s1 = new Stack();
		s1.add(10);
		s1.add(2);
		s1.add(15);
		s1.add(20);
		s1.add(12);
		s1.add(6);
		s1.add(17);
		s1.add(0);
		System.out.println(s1);
		System.out.println(sort(s1));
	}
}
/*
[10, 2, 15, 20, 12, 6, 17, 0]
input :0
Stack :[0]
input :17
Stack :[0, 17]
input :6
Stack :[0, 6]
input :17
Stack :[0, 6, 17]
input :12
Stack :[0, 6, 12]
input :17
Stack :[0, 6, 12, 17]
input :20
Stack :[0, 6, 12, 17, 20]
input :15
Stack :[0, 6, 12, 15]
input :17
Stack :[0, 6, 12, 15, 17]
input :20
Stack :[0, 6, 12, 15, 17, 20]
input :2
Stack :[0, 2]
input :6
Stack :[0, 2, 6]
input :12
Stack :[0, 2, 6, 12]
input :15
Stack :[0, 2, 6, 12, 15]
input :17
Stack :[0, 2, 6, 12, 15, 17]
input :20
Stack :[0, 2, 6, 12, 15, 17, 20]
input :10
Stack :[0, 2, 6, 10]
input :12
Stack :[0, 2, 6, 10, 12]
input :15
Stack :[0, 2, 6, 10, 12, 15]
input :17
Stack :[0, 2, 6, 10, 12, 15, 17]
input :20
Stack :[0, 2, 6, 10, 12, 15, 17, 20]
[0, 2, 6, 10, 12, 15, 17, 20]
*/

