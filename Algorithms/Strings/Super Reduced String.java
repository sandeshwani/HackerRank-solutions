import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static String super_reduced_string(String s){
        // Complete this function
    	//System.out.println("dasda"+s.substring(0,0));
    	try{
    		for(int i=0; i<s.length(); i++){
        		if(s.charAt(i)==s.charAt(i+1)){
        			s = s.substring(0,i).concat(s.substring(i+2, s.length()));
        			//System.out.println(s);
        			//s = s.substring(i+2, s.length());
        			i = -1;
        		}
        	}
        	return s;
    	}
    	catch(Exception e){
    		return s;
    	}
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if(!result.isEmpty()){
        	System.out.println(result );
        	
        }
        else{
        	
        	System.out.println("Empty String");
        }
        
    }
}


