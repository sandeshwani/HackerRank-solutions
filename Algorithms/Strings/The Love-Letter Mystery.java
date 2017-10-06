import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int theLoveLetterMystery(String s){
        // Complete this function
    	s = s.toLowerCase();
    	int i = 0;
    	int j = s.length()-1;
    	int operation = 0;
    	while(j>i){
    		if(s.charAt(i) != s.charAt(j)){
    			operation += Math.abs(s.charAt(j) - s.charAt(i));
    		}
    		i++;
    		j--;
    	}
    	return operation;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}


