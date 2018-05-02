package com.countwords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWorks {

	public static void main(String[] args) 
    { 

        //CANT BE FIXED
        String phrase = "Good Morning. Welcome to my store. My store is a grocery store.";
        String alpha = phrase.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        Map<String, Integer> m1 = new HashMap<String, Integer>();

        String[] words = alpha.split(" ");//those are your words
        for (int i = 0; i < words.length; i++) {
            if (m1.get(words[i]) == null) {
                m1.put(words[i], 1);
            } else {
                int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
                newValue++;
                m1.put(words[i], newValue);
            }
        }
 
        Map<String, Integer> sorted = new TreeMap<String, Integer>(m1);
        for (Object key : sorted.keySet()) {
            System.out.println("Word: " + key + "\tCounts: " + m1.get(key));
        }
        System.out.println("-----------------------------------------");
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] beta = alpha.split(" ");
        Arrays.stream(beta)
        .filter(s -> !s.isEmpty()) // removed empty strings
        .map(String::toLowerCase) // makes all the strings lower case
        .forEach(s -> map.put(s, map.getOrDefault(s, 0) + 1));
        
        map.entrySet().forEach(entry -> {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        });
    }
}
