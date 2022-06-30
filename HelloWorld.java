package com.app;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	public static void main(String []args){
//        HashMap<String, String> holder = new HashMap();
//        String payload= "/name=niranjan/phno=123456789/dateOfBirth=XXXXX";
//       // String payload = "cossn=0, abc=hello/=world";
//        String[] keyVals = payload.split("= ");
//        for(String keyVal:keyVals)
//        {
//          String[] parts = keyVal.split("=",2);
//          holder.put(parts[0],parts[1]);
//        }
//        System.out.println(holder);
		
		String text = "A=B&C=D&E=F";// In this case seperator is ‘&’
		Map<String, String> map = new HashMap<String, String>();

		// Seperator is specified here, to split string on this basis
		for(String keyValue : text.split(" *& *")) {

		// Here the each part is futher splitted taking in account the equal sign ‘=’ which demarcates the key
		// and valuefor the hashmap
		String[] pairs = keyValue.split(" *= *", 2);

		// Those key and values are then put into hashmap
		map.put(pairs[0], pairs.length == 1 ? "" : pairs[1]);

		}
		System.out.println(map);
     }
}
