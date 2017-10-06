import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int liked = 0;
    	int totalLiked = 0;
    	int people = 5;
    	for(int i =0; i<n; i++){
    		liked =  (int) Math.floor(people/2);
    		totalLiked += liked;
    		if (i + 1 == n){
    			System.out.println(totalLiked);
    			break;
    		}
    		people = liked * 3;
    	}
    	//System.out.println(totalLiked);
    }
}