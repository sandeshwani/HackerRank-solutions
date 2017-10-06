import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int i = in.nextInt();
    	int j = in.nextInt();
    	int k = in.nextInt();
    	int count = 0;
    	for(int x = i; x <=j; x++){
    		
    		StringBuilder a = new StringBuilder(Integer.toString(x));
    		a = a.reverse();
    		int b = Integer.parseInt(a.toString());
    		if((x-b) % k == 0){
    			count++;
    		}
    	}
    	System.out.println(count);
    	
    }
}