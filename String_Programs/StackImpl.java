package com.lara8;

import java.util.Stack;

public class StackImpl 
{
	public static void add(Stack stack, int i)
	{
		stack.push(new Integer(i));
		System.out.println("Push("+i+")");
		System.out.println("Stack :"+stack);
	}
	public static void remove(Stack stack)
	{
		System.out.println("popped==>");
		Integer a = (Integer)stack.pop();
		System.out.println(a);
		System.out.println("Stack :"+stack);
	}
	public static void main(String[] args)
	{
		Stack s1 = new Stack();
		add(s1, 10);
		add(s1, 12);
		add(s1, 14);
		add(s1, 1);
		add(s1, 5);
		remove(s1);
		remove(s1);
		remove(s1);
		remove(s1);
		remove(s1);
	}
}
