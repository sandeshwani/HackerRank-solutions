import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int alternatingCharacters(String s){
        // Complete this function
    	char previous = s.charAt(0);
    	int remove = 0;
    	for(int i = 1; i < s.length(); i++ ){
    		if(previous == s.charAt(i)){
    			remove++;
    		}
    		previous = s.charAt(i);
    	}
    	return remove;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}

