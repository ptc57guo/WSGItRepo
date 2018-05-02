package com.treemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Treemaptest {

	static Map<String, Integer> map;
	
	public static void main(String[] args) {
		TreeMap<Integer, List<String>> tmap = new TreeMap<Integer, List<String>>(Collections.reverseOrder());
		insertTmap(tmap, 30, "Sears");
		insertTmap(tmap, 65,  "GM");
		insertTmap(tmap, 65, "Ford");
		insertTmap(tmap, 90, "Amazon");
		insertTmap(tmap, 85, "Apple");
		insertTmap(tmap, 80, "Samsung");
		insertTmap(tmap, 75, "IBM");
		int topPrint = 5;
		printTopX(tmap, topPrint);
		
		map = new HashMap<String, Integer>(10);
		map.put("Sears", 30);
		map.put("GM", 65);
		map.put("Ford", 65);
		map.put("Amazon", 90);
		map.put("Apple", 85);
		map.put("Samsung", 80);
		map.put("IBM", 75);
		
		Map<String, Integer> topTen = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(5)
				.collect(Collectors.toMap(Map.Entry::getKey,  Map.Entry::getValue));
		
		
		topTen.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	}
	
	public static void insertTmap(TreeMap<Integer, List<String>> tmap, int key, String value) {
		List<String> ticker;
		if (tmap.containsKey(key)) {
			ticker = tmap.get(key);
		} else {
			ticker = new ArrayList<String>();
		}
		ticker.add(value);
		tmap.put(key, ticker);
	}

	public static void printTopX(TreeMap<Integer, List<String>> tmap, int topPrint) {
		int count = 0;

		for(Map.Entry<Integer, List<String>> entry : tmap.entrySet()) {
			if (count >= topPrint) {
				break;
			}
			printEntry(entry);
			count++;
		}
	}
	
	public static void printEntry(Map.Entry<Integer, List<String>> entry) {
		int key = entry.getKey();
		List<String> value = entry.getValue();
		if (value.size() > 1) {
			for (String ticker : value) {
				System.out.println(key + " " + ticker);
			}
		}
		else {
			System.out.println(key +" " + value.get(0));
		}
		
	}
	


}
