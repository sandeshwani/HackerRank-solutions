import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count =1;
        for(int i=0; i<s.length(); i++){
        	String character = Character.toString(s.charAt(i));
        	if(character == character.toUpperCase()){
        		count++;
        	}
        	//s.charAt(i) == s.charAt(i)
        }
        System.out.println(count);
        
        
        /* Method 2 below*/
        /*
        String arr[]= s.split("[A-Z]"); 
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
         */
       
    }
}


