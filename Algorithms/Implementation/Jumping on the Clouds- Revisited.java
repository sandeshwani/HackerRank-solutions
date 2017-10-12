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
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i =0;
        int jump = 0;
        int energy = 100;
        while(true){
        	
        	jump = (i + k) % n;
        	
        	if(c[jump]==0){
        		energy --;
        	}
        	else{
        		energy = energy - 3;
        	}
        	i = jump;
        	if(i==0){
        		break;
        	}
        		
        }
        System.out.println(energy);
    }
}


