import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        List<BigInteger> a = new ArrayList<BigInteger>();
        for(int i =0; i<n ; i++){
        	 a.add(new BigInteger(unsorted[i]));
        }
        Collections.sort(a);
        //a.toString();
        for(BigInteger obj:a)  
            System.out.println(obj);  
         } 
        
    }
