package com.lara10;
class Test
{
	/*void test(String s1)
	{
		System.out.println("String");
	}*/
	void test(char[] c1)
	{
		System.out.println("char[]");
	}
}
public class M7 
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.test(null);//ambiguous type
		/*System.out.println(10L);
		//System.out.println(null);
		//t1.test();
*/	}
}
