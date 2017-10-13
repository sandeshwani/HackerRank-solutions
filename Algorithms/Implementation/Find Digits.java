import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	static int result(int n){
		
		int last = 0;
		int temp = n;
		int count = 0;
		while(temp>0){
			
			last = temp % 10;
			temp /= 10;
			
			if(last > 0 && n % last == 0){
					count++;
				}
		}
		
		return count;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int ans = result(n);
            System.out.println(ans);
        }
    }
}