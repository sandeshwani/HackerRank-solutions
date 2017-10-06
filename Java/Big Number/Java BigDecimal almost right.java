/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings. 
Each line  of the  subsequent lines contains a real number denoting the value of .

Constraints


Each  has at most  digits.
Output Format

Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
*/

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      	
      	/*
      	 Using bubble sort in this example does not pass one test case. 
      	 
      	 TEST CASE 0:

Input: 
 9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Bubble sort Output:
90
56.6
50
02.34
.12 -- problem 
0.12 -- problem
0
000.000
-100

Expected Output:
56.6
50
02.34
0.12 -- specific requirement 
.12 -- specific requirement 
0
000.000
-100


 */
      	for(int i=0;i<n;i++){
      		
      		for(int j=i+1;j<n;j++){
      			
      		
      		BigDecimal max= new BigDecimal(s[i]);
      		BigDecimal min = new BigDecimal(s[j]);
      		
      		if(max.compareTo(min) ==-1)
      			
      		{
      			String temp= s[i];
      			s[i]=s[j];
     			s[j]=temp;
      		}
      		
      		
      	}
      	}
      	
      	
      	
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}