import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	static void mergeSort(int arr[], int l, int r){
		if(r>l){
			int mid = l +(r-l) /2;
			
			mergeSort(arr, l, mid);
			mergeSort(arr, mid +1, r);
			merge(arr, l, r, mid);
			}
		
		
	}
	
	static void merge(int arr[], int l, int r, int mid){
		
	        // Find sizes of two subarrays to be merged
	        int n1 = mid - l + 1;
	        int n2 = r - mid;
	 
	        /* Create temp arrays */
	        int L[] = new int [n1];
	        int R[] = new int [n2];
	 
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i)
	            L[i] = arr[l + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = arr[mid + 1+ j];
	 
	 
	        /* Merge the temp arrays */
	 
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	 
	        // Initial index of merged subarry array
	        int k = l;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                arr[k] = L[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < n1)
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2)
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    //int v = in.nextInt();
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
    	arr[i] = in.nextInt();
    }
    
    mergeSort(arr, 0, n-1);
    System.out.println(Arrays.toString(arr));
    
    }
}