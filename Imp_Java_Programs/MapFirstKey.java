package com.lara10;

import java.util.Map;
import java.util.*;
import java.io.*;

public class MapFirstKey
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(5, "five");
		map.put(6, "six");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(8, "eight");
		map.put(7, "seven");
		System.out.println("first Lowest Key is :"+map.firstEntry());
		System.out.println("Lowest key is :"+map.firstKey());
		System.out.println("Ceiling key is :"+map.ceilingEntry(2));
		System.out.println("Ceiling key is :"+map.ceilingKey(5));
	}
}
