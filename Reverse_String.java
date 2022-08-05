/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_java_assignment;

/**
 *
 * @author SHARDUL
 */// java program to reverse a word

import java.io.*;
import java.util.Scanner;

public class Reverse_String {
	public static void main (String[] args) {
		
		String str= "Apple", nstr="";
		char ch;
		
	System.out.print("Original word: ");
	System.out.println("Apple"); 
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}
