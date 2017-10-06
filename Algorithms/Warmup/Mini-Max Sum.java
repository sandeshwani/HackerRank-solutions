import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        long max = arr[1] + arr[2] + arr[3] + arr[4];
        long min = arr[0] + arr[1] + arr[2] + arr[3];
        System.out.print(min+" "+max);
       
    }
}