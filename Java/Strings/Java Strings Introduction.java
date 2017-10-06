/*
String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input

hello
java
Sample Output

9
No
Hello Java
Explanation

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        System.out.println(A.length()+B.length());
        int a= A.compareToIgnoreCase(B);
        if (a<=0)
        	System.out.println("No");
        else 
        	System.out.println("Yes");
        System.out.print(A.substring(0, 1).toUpperCase().concat(A.substring(1,A.length())));
        System.out.print(" "+B.substring(0, 1).toUpperCase().concat(B.substring(1,B.length())));
        
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

