import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = 0;
        //int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            max = Math.max(max, in.nextInt());
        }
        if(max - k > 0){
        	System.out.println(max-k);
        }
        else {
            System.out.println(0);
        }
        
        // your code goes here
    }
}


