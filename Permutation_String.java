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
// Java program to print all the permutations
// of the given string
public class Permutation_String {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans)
	{

		
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			
			char ch = str.charAt(i);

			
			String ros = str.substring(0, i) +
						str.substring(i + 1);

			
			printPermutn(ros, ans + ch);
		}
	}

	
	public static void main(String[] args)
	{
		String s = "abb";
		printPermutn(s, "");
	}
}


    

