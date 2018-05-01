package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		List <Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		//list可重複
		System.out.println(list);
		Set <Integer> set =new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(1);
		System.out.println(set);
		Set <String> set2 =new HashSet<>();
		set2.add("Anna");
		set2.add("Ann");
		set2.add("Ann");
		System.out.println(set2);
		//set不可重複
		Map<String , String> stocks=new TreeMap<>();
		stocks.put("001", "Anna");
		stocks.put("002", "Ann");
		stocks.put("003", "Ann");
		System.out.println(stocks);
	}

}
