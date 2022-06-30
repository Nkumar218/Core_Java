package com.app;

public class TestFinal 
{
	public static void main(String[] args) {
		FinalTest f1 = FinalTest.getFinalTest(101, "Hello");
		System.out.println(f1.getId());
		System.out.println(f1.getName());
		modified(f1.getId(), f1.getName());
		System.out.println(f1);
	}
	private static void modified(Integer id1, String name1) {
		id1 = 200;
		name1 = "HI";
	}
}
