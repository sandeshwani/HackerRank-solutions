/*
You are playing a game on your cell phone. You are given an array of length , indexed from  to . Each element of the array is either  or . You can only move to an index which contains . At first, you are at the position. In each move you can do one of the following things:

Walk one step forward or backward.
Make a jump of exactly length  forward.
That means you can move from position  to ,  or  in one move, but at least one of the following conditions must be true:

The new position contains 0.
The new position is greater than .
You can't move backward from position . If you move to any position greater than , you win the game.

Given the array and the length of the jump, you need to determine if it's possible to win the game or not.

Input Format

In the first line there will be an integer  denoting the number of test cases. Each test case will consist of two lines. The first line will contain two integers,  and . On the second line there will be  space-separated integers, each of which is either  or .

Constraints:




The first integer of the array is always .
Output Format

For each case output YES if it's possible to win the game, output NO otherwise.

Sample Input

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

In the first case, you can just walk to reach the end of the array.
In the second case, you can walk to index  or  and jump from there. In the third case, jump length is too low, and you can't reach the end of the array. In the fourth case, jump length is , so it doesn't matter if you jump or walk, you can't reach the end.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int testCase = 0; testCase < T; testCase++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            
            /* Create array of values */
            int [] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            
            System.out.println(solvable(array, m, 0) ? "YES" : "NO");
        }
    }
    
    /* Basically a depth-first search (DFS). 
       Marks each array value as 1 when visiting (Side-effect: alters array) */
    public static boolean solvable(int [] array, int m, int i) {
        /* Base Cases */
        if (i < 0 || array[i] == 1) {
            return false;
        } else if (i + 1 >= array.length || i + m >= array.length) {
            return true;
        }
        
        array[i] = 1; // marks as visited

        /* Recursive Cases */
        return solvable(array, m, i - 1) || solvable(array, m, i + 1) || solvable(array, m, i + m);
    }
}