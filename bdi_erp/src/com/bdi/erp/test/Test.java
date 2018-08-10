package com.bdi.erp.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	private static long sTime;
	private static long eTime;
	public static void start() {
		sTime = System.nanoTime();
	}
	public static void end() {
		eTime = System.nanoTime();
		System.out.println("execute time : " + (eTime-sTime)/100000);
	}
	public static void main(String[] args) {
		start();
		List<User> uList = 
				new ArrayList<User>();
		for(int i=0;i<100000;i++) {
			User u = new User();
			u.setA("address"+1);
			u.setB("address"+1);
			u.setC("address"+1);
			u.setD("address"+1);
			u.setE("address"+1);
			u.setF("address"+1);
			u.setG("address"+1);
			u.setName("name"+1);
			u.setAge("age"+1);
			u.setAddress("address"+1);
			uList.add(u);
		}
		for(User us:uList) {
			String str = us.getName()+us.getAge()+us.getAddress()+us.getA()+us.getB()+us.getC()
			+us.getD()+us.getE()+us.getF()+us.getG();
		}
		System.out.println();
		end();
		start();
		List<Map<String,String>> list = 
				new ArrayList<Map<String,String>>();
		for(int i=0;i<100000;i++) {
			Map<String,String> hm = new HashMap<String,String>();
			hm.put("name", "name"+1);
			hm.put("age", "age"+1);
			hm.put("address", "address"+1);
			hm.put("a", "address"+1);
			hm.put("b", "address"+1);
			hm.put("c", "address"+1);
			hm.put("d", "address"+1);
			hm.put("e", "address"+1);
			hm.put("f", "address"+1);
			hm.put("g", "address"+1);
			list.add(hm);
		}

		for(Map<String,String> hm : list) {
			String str = hm.get("name") + hm.get("age")+hm.get("address")+hm.get("a")+hm.get("b")+hm.get("c")
			+hm.get("d")+hm.get("e")+hm.get("f")+hm.get("g");
		}
		System.out.println();
		end();

	}
}
