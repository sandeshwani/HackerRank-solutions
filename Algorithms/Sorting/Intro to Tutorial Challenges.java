import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	static int binarySearch(int arr[], int l, int r, int v){
		if(r>=l){
			int mid = l +(r-l) /2;
			if(arr[mid]==v){
				return mid;
			}
			else if(arr[mid] > v){
				return binarySearch(arr, l, mid-1, v);
			}
			else if(arr[mid] < v){
				return binarySearch(arr, mid+1, r, v);
			}
		}
		return -1;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int v = in.nextInt();
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
    }
    
    int result = binarySearch(arr, 0, n-1, v);
    System.out.println(result);
    
    }
}