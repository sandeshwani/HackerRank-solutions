import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String check) {
        ArrayDeque<Character> parens = new ArrayDeque<Character>();
		for(int i=0;i<check.length();i++){
			char ch = check.charAt(i);
			
			if(ch== '{' || ch== '(' || ch== '['){
				parens.push(ch);
			}
			else if(ch== '}' || ch== ')' || ch== ']'){
				
				if(parens.isEmpty())	
                    return "NO";
                
				switch(ch){
				
				case '}':
					if(parens.pop()!= '{')
						return "NO";
					break;
					
				case ')':
					if(parens.pop()!= '(')
						return "NO";
					break;
					
				case ']':
					if(parens.pop()!= '[')
						return "NO";
					break;
					
				default:
					break;
						
				}
			}
		}
		if(parens.isEmpty())
			return "YES";
		else 
			return "NO";
		
	}
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}

