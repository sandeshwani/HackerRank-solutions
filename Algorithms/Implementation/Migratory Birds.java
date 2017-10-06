import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
    	int a[] = new int[ar.length];
    	for(int i=0; i<ar.length; i++){
    		a[ar[i]]++;
    	}
    	int max=0;
    	int index=0;
    	for(int i = 0; i<ar.length; i++){
    		if(a[i] >max){
    			index = i;
    			max = a[i];
    		}
    	}
    	//System.out.println("Frequency is:"+a[index]);
    	return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

