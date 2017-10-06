//Problem: https://www.hackerrank.com/challenges/designer-pdf-viewer
//Java 8
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        
        int i =0;
        for(char ch = 'a'; ch <= 'z'; ch++){
        	hm.put(ch, h[i]);
        	i++;
        }
        
        String word = in.next();
        
        int max =0;
        for(int j = 0; j<word.length(); j++){
        	if(max < hm.get(word.charAt(j))){
        		max = hm.get(word.charAt(j));
        	}
        }
        System.out.println(max * word.length());
        
    }
}