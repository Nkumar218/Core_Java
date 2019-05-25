package com.lara2;

import java.util.*;

public class DuplicateChar 
{
	public static void duplicateChar(String word)
	{
		char[] character = word.toCharArray();
		Map<Character, Integer> mapChar = new HashMap<Character, Integer>();
		for(Character ch : character)
		{
			if(mapChar.containsKey(ch))
			{
				mapChar.put(ch, mapChar.get(ch) + 1);			
			}
			else
			{
				mapChar.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = mapChar.entrySet();
		System.out.printf("List of duplicate character in String is '%s' '%n", word);
		for(Map.Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue() > 1)
			{
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}
	public static void main(String[] args) 
	{
		duplicateChar("programming");
		duplicateChar("india");
		duplicateChar("combination");
	}
}
