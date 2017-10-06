/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

Constraints




The numbers in the array will range between .

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is .
*/
/* Level: Medium */
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;

class Solution{
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max =map.size();
        
        for (int i = 0; i < n; i++) {
        	int num = in.nextInt();
            if(i>=m){
            	int old=deque.remove();
            	if(map.get(old)==1){
            		map.remove(old);
            	}
            	else{
            		map.merge(old, -1, Integer::sum);
            	}
            }
            deque.add(num);
            map.merge(num, 1, Integer::sum);
            //System.out.println(map);
            max = Math.max(max, map.size());
            
        }
        in.close();
        System.out.println(max);
	}
	
      
   
}

