import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            
            String check = "hackerrank";
            int j=0;
            
            for(int i=0; ; i++){
            	
            	if(s.charAt(i) == check.charAt(j)){
            		j++;
            		
            	}
            	if(j == check.length()){
        			System.out.println("YES");
        			break;
        		}
            	if(i+1 == s.length()){
            		System.out.println("NO");
            		break;
            	}
            	
            }
            // your code goes here
        }
    }
}



