package com.daysbetweendates;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        //BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st;
        String entrada = "";

        int year = 0, month = 0, day = 0;
        int expectedYear = 0, expectedMonth = 0, expectedDay = 0;
        int actualYear = 0, actualMonth = 0, actualDay = 0;
        int loopCounter = 0;
        try {
            while((entrada = br.readLine())!=null){
                st = new StringTokenizer(entrada," ");

                while(st.hasMoreTokens()){
                    day = Integer.parseInt(st.nextToken());
                    month = Integer.parseInt(st.nextToken());
                    year = Integer.parseInt(st.nextToken());
                }
                if (loopCounter == 0) {
                    actualYear = year;
                    actualMonth = month;
                    actualDay = day;
                }
                else {
                    expectedYear = year;
                    expectedMonth = month;
                    expectedDay = day;
                }
                loopCounter++;
            }
        }
        catch (Exception e) {
            
        }


 
  
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  		LocalDate end = LocalDate.of(expectedYear, expectedMonth, expectedDay);
		LocalDate start = LocalDate.of(actualYear, actualMonth, actualDay);
        //System.out.println("Days between start and end " + end.until(start, ChronoUnit.DAYS));
        int fine = 0;
        if ( end.until(start, ChronoUnit.DAYS) <= 0 ) {
           fine = 0; 
        }
        else if ( (expectedYear == actualYear) & (expectedMonth == actualMonth)) {
            fine = (int)end.until(start, ChronoUnit.DAYS) * 15;
        }
        else if ( (expectedYear == actualYear ) ) {
            fine = (actualMonth - expectedMonth) * 500;
        }
        else {
            fine = 10000;
        }
        
        System.out.println(fine);
    }
}	
