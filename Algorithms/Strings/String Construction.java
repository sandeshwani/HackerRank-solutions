import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int stringConstruction(String s) {
        // Complete this function

    	//return s.chars().distinct().count(); // this one linear gives the same output.
    	Set<Character> s1 = new HashSet<Character>();
    	for(char ch: s.toCharArray()){
    		s1.add(ch);
    	}

    	return s1.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
