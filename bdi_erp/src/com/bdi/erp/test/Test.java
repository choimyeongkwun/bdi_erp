package com.bdi.erp.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void test(Map<String,String> map) {
		map.put("a", "a");
	}
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		test(map);
		
		List<Map<String,String>> mList = new 
				ArrayList<Map<String,String>>();
		mList.add(map);
		mList.add(map);	
		mList.add(map);	
		
		map.put("a", "test");

		System.out.println(mList.get(0)==mList.get(1));
	
	}
}
