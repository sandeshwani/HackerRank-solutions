/*
Iterating through every element of  stack without removing it from stack

Stack<YourObject> stack = ...

Iterator<YourObject> iter = stack.iterator();

while (iter.hasNext()){
    System.out.println(iter.next());
}


for(YourObject obj : stack)
{
    System.out.println(obj);
}

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    Stack<Integer> mainStack = new Stack<Integer>();
    Stack<Integer> maxStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    maxStack.push(max);
    for(int i = 0 ; i<t; i++){
    	int op = in.nextInt();
    	switch(op){
    	case 1: 
    		int number = in.nextInt();
    		mainStack.push(number);
    		max = Math.max(maxStack.peek(), number);
    		maxStack.push(max);
    		break;
    	
    	case 2: 
    		mainStack.pop();
    		maxStack.pop();
    		break;
    		
    	case 3:
    		System.out.println(maxStack.peek());
    		break;
    		
    	}
    }
  }
}