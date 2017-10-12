import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        // Complete this function
        if(a.length == 1)
            return "YES";
        int sum[] = new int[a.length];
        sum[0]=a[0];
        for(int i = 1; i<a.length; i++){
            sum[i] = sum[i-1] + a[i];
        }
        if(sum[1] == 0)
            return "YES";
        for(int i = 1; i<a.length; i++){
            if(sum[i-1] == (sum[sum.length-1] - sum[i]))
                return "YES";
        }
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}

