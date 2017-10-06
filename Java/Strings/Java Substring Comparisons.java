/*
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format

The first line contains a string denoting . 
The second line contains an integer denoting .

Constraints


 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :


We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
    	Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        in.close();
        String min=str.substring(0, k);
        String max=str.substring(0, k);
        int z =k;
        for(int i=0;i<str.length()-(z-1);i++){
        	String subStr=str.substring(i, k);
        	//System.out.println(subStr);
        	
        	if(subStr.compareTo(min) <=0)
        		min=subStr;
        	if(subStr.compareTo(max) > 0)
        		max = subStr;
        		k++;
        }
        System.out.println(min);
        System.out.println(max);
    }
}


