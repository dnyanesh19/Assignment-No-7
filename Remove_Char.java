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
public class Remove_Char {  
    public static void main(String[] args) {  
              String str = "India is my country";  
              System.out.println(charRemoveAt(str, 6));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}  
