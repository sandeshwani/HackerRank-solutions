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
        //Queue<Integer> q = new PriorityQueue<Integer>();
        //Queue<Integer> q = new ArrayDeque<Integer>();
        //Queue<Node> q = new LinkedList<Node>();
    	ArrayDeque<Integer> q = new ArrayDeque<Integer>();
    	while(n > 0 ){
    		int op = in.nextInt();
    		
    		switch(op){

    		case 1:
    			int number = in.nextInt();
    			q.add(number);
    			break;
    			
    		case 2:
    			q.pollFirst();
    			break;
    			
    		case 3:
    			System.out.println(q.peekFirst());
    			break;
    		}
    		
    		n--;
    	}
    }
}