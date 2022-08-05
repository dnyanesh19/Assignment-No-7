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
public class Palindrome_String {
   public static void main(String args[]) {
      String myString = "radar";
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         System.out.println("Given String is palindrome");
      } else {
         System.out.println("Given String is not palindrome");
      }
   }
}
