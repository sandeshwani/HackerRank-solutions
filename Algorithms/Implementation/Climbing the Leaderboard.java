import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int[] ranks = new int[n]; //The dense ranking of the scores
        
        //Initialize dense ranking and scores
        for(int i=0, rank=1; i < n; i++){
            int s = in.nextInt();
            scores[i] = s;
            if(i > 0 && scores[i-1] != s)
                rank++;
            ranks[i] = rank;    
        }
        //System.out.println();
        //System.out.println(Arrays.toString(scores));
        //System.out.println(Arrays.toString(ranks));
        
        int m = in.nextInt();
        int i =m;
        boolean input = true;
        int score = 0;
        for(int j = scores.length-1; j>=0;  j--){
        	//System.out.println(scores[j]);
        	//System.out.println(ranks[j]);
        	if(input && i>0){
        		score = in.nextInt();
        		i--;
        	}
        	
        	if(score == scores[j]){
        		System.out.println(ranks[j]);
        		input = true;
        		continue;
        	}
        	else if(score < scores[j]){
        		System.out.println(ranks[j]+1);
        		input = true;
        		j++;
        		continue;
        	}
        	else if(score > scores[j]){
        		if(j==0){
        			input = true;
        			System.out.println(1);
        		}
        		input = false;
        		continue;
        	}
        }
        while(input && i>0){
        	int s = in.nextInt();
        	System.out.println(1);
        	i--;
        }
    }
}


