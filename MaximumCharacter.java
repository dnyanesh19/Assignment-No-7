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
import java.util.*;
public class MaximumCharacter
{
  public static void main(String[] args) {
      Scanner in = new Scanner(System. in);
      String k = in.nextLine();
      char tempArray[] = k.toCharArray(); 
        Arrays.sort(tempArray); 
        String s = new String(tempArray);
        int n = s.length();
        int max_count = 0;
        int count = 1;
        char ans = '-';
        for (int i = 1; i <= n; i++)
        {
            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
            {
                if (max_count < count)
                {
                    max_count = count;
                    ans = s.charAt(i-1);
                }
                count = 1;
            }
            else
            {
                count++;
            }
        }
    System.out.println("Maximum occurring character is "+ans);
  }
}
