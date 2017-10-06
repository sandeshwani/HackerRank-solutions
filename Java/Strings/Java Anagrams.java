/*
Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  is .

Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.

This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.
*/



import java.io.*;
import java.util.*;

public class Solution {    
	
	static boolean isAnagram(String a, String b) {
		
		char sorted_a[]=a.toLowerCase().toCharArray();
		char sorted_b[]=b.toLowerCase().toCharArray();
		
		Arrays.sort(sorted_a);
		Arrays.sort(sorted_b);
		
		//below 2 lines help us to convert char array to string, two ways :
		/*String newString1 = String.valueOf(sorted_a);
		String newString2 = new String(sorted_b);*/
		
		//the below line does not return true even if both the array are true
		//System.out.println(sorted_a.equals(sorted_b)); 
		
		//the below line does not return string, output string is weired
		//System.out.println(sorted_a.toString());
		
		//returns true if and only if both sorted_a and sorted_b points to the same reference (location). here it returns false
		//System.out.println(sorted_a.equals(sorted_b));
		
		//check if two arrays are equal
		if(Arrays.equals(sorted_a, sorted_b))
		
			return true;
		else 
			return false;		
	}
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}