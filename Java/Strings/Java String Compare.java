/*
Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3
Sample Output

ava
wel
Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.
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
        	
            /*
            if substr preceds min in lexicographically order turns in negative
            if substr follows max in lexicographically order turns in positive
            equal means same string.
            */
        	if(subStr.compareTo(min) < 0)
        		min=subStr;
        	if(subStr.compareTo(max) > 0)
        		max = subStr;
        		k++;
        }
        System.out.println(min);
        System.out.println(max);
    }
}

