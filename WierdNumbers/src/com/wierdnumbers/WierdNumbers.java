package com.wierdnumbers;


import java.util.Scanner;

public class WierdNumbers {	   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code
          if (n <= 5){
              ans = "Not Wierd";
          }
          if (n > 5 & n <=20){
             ans = "Wierd";
          }
          else{
              ans = "Not Wierd";
          }
 
      }
      System.out.println(ans);
      //String m = scan.nextLine();
   }
}

