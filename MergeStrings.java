package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeStrings 
{
	public static String [] merge(String [] firstStr, String [] secondStr) {
		if(firstStr == null || firstStr.length==0)
			return firstStr;
		if(secondStr==null || secondStr.length==0)
			return secondStr;
		List<String> first = Arrays.asList(firstStr);
		List<String> second = Arrays.asList(secondStr);
		
		List<String> result = new ArrayList<>(first);
		List<String> tmp = new ArrayList<>(first);
		tmp.retainAll(second);
		result.removeAll(tmp);
		result.addAll(second);
		return (result.toArray(new String[result.size()]));
	}
	public static void main(String[] args) {
		String[] names1 = new String[] {"Ava", "Emma", "Olivia","Dummy"};
		String[] names2 = new String[] {"Ava", "Emma", "Olivia","Anand"};
     //   String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", merge(names1, names2)));
	}
}
