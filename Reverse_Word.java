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
public class Reverse_Word {
    public static void main(String args[]) {
      String s[] = "you shall not pass".split(" "); 
      String ans = ""; 
      for (int i = s.length - 1; i >= 0; i--) { 
        ans += s[i] + " "; 
      } 
      System.out.println("Reversed String: " + ans); 
    }
}

    

