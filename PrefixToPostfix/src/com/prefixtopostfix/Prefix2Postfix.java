package com.prefixtopostfix;


import java.util.Stack;

public class Prefix2Postfix {
    public static final String prefixInput ="-4/+1*327";
	//public static final String prefixInput = "+-435";
    //desired postfix output is "ab/c*de+f*-"

    public static void main (String[] args){
        System.out.println(pre2post(prefixInput));
    }

    public static String pre2post(String pre){
    		StringBuilder answer = new StringBuilder();
    		Stack<String> operand = new Stack<String>();
        if(pre.length() > 1){
	        for (int i = pre.length()-1; i >= 0; i--) {
	        		if (isDigit(pre.charAt(i)))
	        			operand.push(String.valueOf(pre.charAt(i)));
	        		else {
	        			answer.append(operand.pop());
	        			answer.append(operand.pop());
	        			answer.append(pre.charAt(i));
	        			operand.push(answer.toString());
	        			answer.setLength(0);
	        		}
	        }
        }

//        answer.append(pre.substring(i, pre.length()));
        answer.setLength(0);
        for ( String s : operand)
        		answer.append(s);
        return answer.toString();
    }
    
    public static boolean isDigit(char operand) {
    		return Character.isDigit(operand);
    }
}
