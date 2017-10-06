/*
We use the integers a, b,n and  to create the following series:


You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of  space-separated integers.

Input Format

The first line contains an integer, q, denoting the number of queries. 
Each line  of the  subsequent lines contains three space-separated integers describing the respective ai, bi ,ni and  values for that query.

Constraints




Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use a=0,b=2 ,n=10 and  to produce some series :




... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :






We then print each element of our series as a single line of space-separated values.
*/

import java.util.*;
import java.math.*;
import java.io.*;
class Solution{
    public static void main(String []argh){
    	int ans;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            /*
            Note ^ in java stands for bitwise operator.
            First sequence below 
            */
            ans = (int) (a + Math.pow(2, 0) * b);
            System.out.print(ans);
            
            for(int j=1;j<=n-1;j++){
            	//all the sequence after the 1st one
            	ans = ans + (int) (Math.pow(2, j) *b);
            	System.out.print(" "+ ans);  	
            }
        System.out.println();
        
        }
        in.close();
    }
}

