import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
    	int total = 0;
    	for(int i=0; i < ar.length; i++){
    		if(i != k){
    			total += ar[i];
    		}
    	}
    	int should_charge = total/2;
    	return b - should_charge; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result!=0){
        	System.out.println(result);
        }
        else{
        	System.out.println("Bon Appetit");
        }
        
    }
}


