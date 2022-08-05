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
// Java program to check if two given strings are rotations of each other

public class String_Rotation
{
	
	static boolean areRotations(String str1, String str2)
	{
		
		return (str1.length() == str2.length()) &&
			((str1 + str1).indexOf(str2) != -1);
	}
	
	
	public static void main (String[] args)
	{
		String str1 = "AACD";
		String str2 = "ACDA";

		if (areRotations(str1, str2))
			System.out.println("Strings are rotations of each other");
		else
			System.out.printf("Strings are not rotations of each other");
	}
}



