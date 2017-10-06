/*
Method 1 : my method
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int gemstones(String[] arr){
        // Complete this function
    	Set<Character> a = new HashSet<Character>();
    
    	for(char c: arr[0].toCharArray()){
    			a.add(c);
    	}
    	Set<Character> b = new HashSet<Character>();
    	
    	for(int i=1; i < arr.length; i++ ){
    		for(char c: arr[i].toCharArray()){
    			b.add(c);
    		}
    		a.retainAll(b);
    		b.clear();
    		//System.out.println(a);
    	}
    	return a.size();
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}

/*
Method 2 : copeied method
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static Set<Character> stringToSet(String s){
        Set<Character> set = new HashSet<Character>();
        for(char a : s.toCharArray()){
            set.add(a);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Character> gemstones = stringToSet(in.nextLine());
        
        for(int i = 1; i < n; i++){
            gemstones.retainAll(stringToSet(in.nextLine()));
        }
        System.out.println(gemstones.size());
    }
}

