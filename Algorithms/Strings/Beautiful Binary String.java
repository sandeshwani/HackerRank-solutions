import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int minSteps(int n, String B){
        
    	int i = 0;
    	int j = 3;
    	int step = 0;
    	String s1 = "010";
    	while(j<= B.length()){
    		//System.out.println(B.substring(i, j));
    		if(B.substring(i, j).equals(s1) ){
    			//System.out.println("yes");
    			step++;
    			i = i + 2;
    			j = j + 2; 
    		}
    		i++;
    		j++;
    	}
    	return step;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}


