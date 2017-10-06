/*
Method 1 : my method takes O(n)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static String funnyString(String s){
        // Complete this function
    	s = s.toLowerCase();
    	StringBuilder r = new StringBuilder(s);
    	r = r.reverse();
    	
    	for(int i=1; i <s.length(); i++){
    		//System.out.println(s.charAt(i) - s.charAt(i-1) );
    		//System.out.println((r.toString().charAt(i) - r.toString().charAt(i-1)));
    		if( Math.abs(( s.charAt(i) - s.charAt(i-1) )) != Math.abs((r.toString().charAt(i) - r.toString().charAt(i-1))) ){
    			
    			return "Not Funny";
    		}
    	}
    	return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}

/*
Method 2 : copied method takes O(n/2)
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        
        tests:
        for(int i = 0; i < T; i++)
        {
            String s = input.nextLine();
            for(int j = 1; j < (s.length()/2)+1; j++)
            {
                int left = Math.abs(s.charAt(j) - s.charAt(j-1));
                int right = Math.abs(s.charAt(s.length()-1-j) - s.charAt(s.length()-j));
                if( left != right)
                {
                    System.out.println("Not Funny");
                    continue tests;
                }
            }
            System.out.println("Funny");
        }
    }
}
