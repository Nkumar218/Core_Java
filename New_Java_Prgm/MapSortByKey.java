package com.app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapSortByKey {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("K1", 108);
		map.put("K2", 109);
		map.put("K4", 107);
		map.put("K9", 101);
		map.put("K5", 102);
		map.put("K7", 103);
		map.put("K3", 105);
		map.put("K8", 106);
		map.put("K6", 104);
		Set<String> set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+" : "+map.get(obj));
		}
	}
}
