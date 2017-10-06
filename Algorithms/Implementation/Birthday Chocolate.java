import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        
    	int count = 0;
    	int total = 0;
    	for(int i=0; i<m; i++){
        	total += s[i];
        }
    	//System.out.println(total);
    	if(total==d)
    		count++;
    	
    	int j = 0;
    	for(int i = m; i<s.length; i++){
    		total = s[i] + total - s[j];
    		j++;
    		//System.out.println(total);
    		if(total==d){
    			count++;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

