import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        int a_count=0;
        int o_count=0;
        
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(s <= (a + apple[apple_i]) && ((a + apple[apple_i])) <= t )
                a_count++;
        }
        
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(s <= (b + orange[orange_i]) && ((b + orange[orange_i])) <= t )
                o_count++;
        }
        
        System.out.println(a_count);
        System.out.println(o_count);
    }
}

