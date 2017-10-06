import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
    	Arrays.sort(ar);
    	//System.out.println(Arrays.toString(ar));
    	int max=0;
    	for(int i=0; i<ar.length-1;i++){
    		if(ar[i]==ar[ar.length-1]){
    			max++;
    		}
    	}
    	return max+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}