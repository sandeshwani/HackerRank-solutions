/*
Time Complexity: O(n)  //We have to look at every input integer
Space Complexity: O(n) //We have to store a map of at most all elements
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Map<Integer,Integer> frequencies = new TreeMap<Integer, Integer>();
        for(int i =0; i <a.length; i++){
        	if(frequencies.containsKey(a[i])){
        		frequencies.put(a[i], frequencies.get(a[i]) + 1);
        	}
        	else{
        		frequencies.put(a[i], 1);
        	}
        }
        System.out.println(frequencies);
        
        int max = 0;
        for(int i: frequencies.keySet()){
        	int currentMax =0;
        	if(frequencies.containsKey(i+1)){
        		currentMax =  frequencies.get(i) + frequencies.get(i+1);
        	}
        	else{
        		currentMax = frequencies.get(i);
        	}
        	if(currentMax > max){
        		max = currentMax;
        	}
        	
        }
        System.out.println(max);
    }
}