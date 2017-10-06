/*
incomplete
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int getTotalX(int[] a, int[] b) {
        
    	
    	BigInteger x = BigInteger.valueOf(0);
    	BigInteger y = BigInteger.valueOf(0);
    	BigInteger gcd = BigInteger.valueOf(0);
    	int u =0;
    	for(int i=0; i<=b.length-1; i++){
    		
    		if(i!=0){
    			x=gcd;
    		}
    		y = BigInteger.valueOf(b[i]);
    		gcd = x.gcd(y);
    		
    	}
    	
    	
    	System.out.println(gcd);
    	int lcm=a[0];
    	for(int i=1; i<a.length;i++){
    		BigInteger p = BigInteger.valueOf(lcm);
        	BigInteger q = BigInteger.valueOf(a[i]);
    		lcm = (((a[i] * lcm)) / (p.gcd(q).intValue())); 
            
    	}
    	System.out.println(lcm);
    	return 0;
    	
    		
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}


