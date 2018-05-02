package com.contacts1;
import java.util.*;

public class Solution {

    static HashMap<Character, ArrayList<String>> myContacts = new HashMap<Character, ArrayList<String>>(26);
    static ArrayList<String> contacts = new ArrayList<String>(10);
    static ArrayList<String> finds = new ArrayList<String>(10);
    public static void main(String[] args) {
        int j = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (char i = 'a'; i <= 'z'; i++)
            myContacts.put(i,new ArrayList<String>());

        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next(); 
            if (op.equals("add"))
        		    add(contact);
            if (op.equals("find")) 
        		    finds.add(contact);
        }
        for (String find : finds)
        {
            j = search(find);
            System.out.println(j);
        }
    } 
    
    public static void add(String str)
    {
    		//names.add(str);
    		ArrayList<String> list = myContacts.get(str.charAt(0));
    		list.add(str);
    		myContacts.put(str.charAt(0), list);
    }
    
    public static int search(String str)
    {
    		int i = 0;
 //   		for (String name : names) {
 //   			if (name.contains(str)) {
 //   				i++;
 //   			}
 //   		}
    		ArrayList<String> list = myContacts.get(str.charAt(0));
    		for (String s : list) {
    			if (s.startsWith(str))
    			   i++;
    		}
    		return i;
    }
}


