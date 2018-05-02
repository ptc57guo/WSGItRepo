package com.mergearrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	 public static void mergeStringArray() {
	    String a[] = { "A", "E", "I" };
	    String b[] = { "O", "U" };
        String[]c = new String[a.length+b.length];
        int count = 0;
      
        for(int i = 0; i<a.length; i++) { 
           c[i] = a[i];
           count++;
        } 
        for(int j = 0;j<b.length;j++) { 
           c[count++] = b[j];
        } 
        for(int i = 0;i<c.length;i++) System.out.print(c[i]+" ");
        System.out.println("");
    }
	 
	public static void mergeIntegerArray() {
        int[]a = {1,2,3,4};
        int[]b = {4,16,1,2,3,22};
        int[]c = new int[a.length+b.length];
        int count = 0;
      
        for(int i = 0; i<a.length; i++) { 
           c[i] = a[i];
           count++;
        } 
        for(int j = 0;j<b.length;j++) { 
           c[count++] = b[j];
        } 
        for(int i = 0;i<c.length;i++) System.out.print(c[i]+" ");
        System.out.println("");
		
	}
	 
	public static void mergeIntegerCollection() {
        int[]a = {1, 2, 3, 4};
        int[]b = {4, 16, 1, 2, 3, 22};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.addAll(list, Arrays.stream(b).boxed().toArray(Integer[]::new));
        //list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println("***************************");
        for (Integer i : list) {
        		System.out.print(i);
        }
        System.out.println("");
        System.out.println("---------------------------");
        //System.out.println(Arrays.toString(c));
		
	}

    public static void mergeStringCollection() {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        for (Object o : list) {
        		System.out.print(o);
        }
        //System.out.println(Arrays.toString(c));
    }
    
    public static void mergeStringArrayRemoveDups() {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        for (Object o : list) {
        		System.out.print(o);
        }
        //System.out.println(Arrays.toString(c));
    	
    }
    
    public static void mergeIntegerArrayRemoveDups() {
        int[]a = {1, 2, 3, 4};
        int[]b = {4, 16, 1, 2, 3, 22};
        Set<Integer> list = Set.stream(a).boxed().collect(Collectors.toList());
        Collections.addAll(list, Arrays.stream(b).boxed().toArray(Integer[]::new));
        //list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println("***************************");
        for (Integer i : list) {
        		System.out.print(i);
        }
        System.out.println("");
        System.out.println("---------------------------");
        //System.out.println(Arrays.toString(c));
		
   	
    }
    
    public static void main(String args[]) {
    		mergeStringArray();
    		mergeIntegerArray();
    		mergeIntegerCollection();
    		mergeStringCollection();
    }
}
