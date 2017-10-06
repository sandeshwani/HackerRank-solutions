/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
    	Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        
        
        /*
         ********method 1*******
        1 Test case failed: aabbbbaa
        int k=A.length()-1;
       	for(int i=0;i-1<=k;i++){
       		if(A.charAt(i)==A.charAt(k)){
       			
       			if(i==k) System.out.println("Yes");
       			k--;
       			continue;
       		}
       			
       		else {
       			System.out.println("No");
       			break;
       		}
       	} 
       	************Method 1 ends***********/
       	
       	/* *****Method 2*********
        char b[] =A.toCharArray();
        char c[] =A.toCharArray();
        int j=0;
        for(int i=b.length-1;i>=0;i--){
        	c[j]=b[i];
        	j++;
        }
       
        
      System.out.println(Arrays.equals(b,c) ? "Yes" : "No" );
      
      *************Method 2 ends**************/
        
        /*
         ********method 3*******
         StringBuilder sb = new StringBuilder(A);
        //in the below line we have to cnver the stringbuilder to string as we are using string.toequal method. so both should be in string ie A and sb
        if(A.equals(sb.reverse().toString()))
        		System.out.println("Yes");
        else
        	System.out.println("No");
        	
        	
        ************Method 3 ends************/
        
        
        
    }
}


