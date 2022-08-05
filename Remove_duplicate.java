package pkg07_java_assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHARDUL
 */
// Java program to remove duplicate character from character array and print in sorted order
import java.util.*;

public class Remove_duplicate {
	
	static void removeDuplicate(char str[], int n)
	{
	
		HashSet<Character> s = new LinkedHashSet<>(n - 1);
	
		for (char x : str)
			s.add(x);

		
		for (char x : s)
			System.out.print(x);
	}

	
	public static void main(String[] args)
	{
		char str[] = "Apple".toCharArray();
		int n = str.length;

		removeDuplicate(str, n);
	}
}


