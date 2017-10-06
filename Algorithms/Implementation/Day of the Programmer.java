import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        if(year <= 1917){
            int feb =0;
            if(year % 4 == 0){
                feb = 29;
            }
            else {
                feb = 28;
            }
            int d = 256 - (215 + feb);
            return d+".09."+year;
            
        }
        if(year == 1918){
            int feb = 15;
            int d = 256 - (215 + feb);
            return d+".09."+year;
            
        }
        
        if(year >= 1919){
            int feb = 0;
            if(( year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                feb = 29;
            }
            else {
                feb = 28;
            }
            int d = 256 - (215 + feb);
            return d+".09."+year;
        }
        return "not";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}

