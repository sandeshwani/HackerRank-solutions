import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
    	int high=s[0];
    	int low=s[0];
    	int high_break =0;
    	int low_break =0;
    	for(int i=1; i<s.length; i++){
    		if(s[i] > high){
    			high = s[i];
    			high_break++;
    		}
    		if(s[i] < low){
    			low = s[i];
    			low_break++;
    		}
    	}
    	int b[] = {high_break, low_break};
    	return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}


