/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;
public class Reverse_string1 {
   public static String reverseString(String str){
      if(str.isEmpty()){
         return str;
      }else{
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.next();
      String result =Reverse_string1.reverseString(str);
      System.out.println(result);
   }
}

    

