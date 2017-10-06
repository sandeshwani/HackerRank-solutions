import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i =1;
        int count =0;
        for(char ch : S.toCharArray()){
        	
        	if(i == 1 || i == 3){
        		if(ch != 'S'){
        			count++;
        			
        		}
        	}
        	if(i ==2){
        		if(ch != 'O'){
        			count++;
        		}
        	}
        	i++;
        	if(i==4){
        		i = 1;
        	}
        }
        System.out.println(count);
    }
}


