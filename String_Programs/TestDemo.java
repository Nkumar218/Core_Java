package com.lara2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> t1 = new HashMap<>();
		t1.put("abc", 101);
		t1.put("abc1", 102);
		t1.put("abc2", 103);
		t1.put("ab3", 104);
		t1.put("abc4", 101);
		t1.put("abc5", 101);
		t1.put("null", 20);
		//System.out.println(t1);
		//System.out.println(t1);
		/*Set s1 = t1.keySet();
		Iterator it = s1.iterator();
		while (it.hasNext()) 
		{
			Object object = (Object) it.next();
			System.out.println(object+":"+t1.get(object));
		}*/
		Set<Map.Entry<String, Integer>> s1 = t1.entrySet();
		List list = new ArrayList<>(s1);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
		{
			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) 
			{
				// TODO Auto-generated method stub
				return arg0.getValue().compareTo(arg1.getValue());
			}
		});
		list.forEach(System.out:: println);
	}
}
