import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Scanner in = new Scanner(System.in);
    	String s = in.nextLine();
    	s = s.toLowerCase();
    	Set<Character> check = new HashSet<Character>();
    	for(char ch ='a'; ch <= 'z'; ch++){
    		check.add(ch);
    		
    	}
    	for(int i=0; i<s.length(); i++){
    		
    		if(check.contains(s.charAt(i))){
    			check.remove(s.charAt(i));
    		}
    		
    		if(check.isEmpty()){
    			System.out.println("pangram");
    			System.exit(0);;
    		}
    	}
    	System.out.println("not pangram");
    	
    }
}


