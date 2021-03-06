/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Input Format

A single string, .

Constraints


 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        /*
        trim is used to remove the white spaces in start. white spaces in back are automatically handeled by regex operation.
        test case:            YES      leading spaces        are valid,    problemsetters are         evillllll    */
        s= s.trim();
        /*if you entered only space it should return zero and not 1. temp.length returns 1 if we had entered only space without the below if condition */
        if(s.isEmpty()){
        	System.out.println("0");
        	System.exit(0);
        }
        
        String temp[]=s.split("[\\s!,?._'@]+");
        System.out.println(temp.length);
        for(int i=0; i<temp.length;i++)
        	System.out.println(temp[i]);
        //System.out.println(Arrays.toString(temp));
        scan.close();
    }
}


