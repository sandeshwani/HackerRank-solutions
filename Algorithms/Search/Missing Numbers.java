/*
Time complexity is O(n log n)
breakup:
first n number of integer in hash map O(n)
second m number of integer in hash map O(m)
Iterating through the hash map less than O(m)
Sorting arraylist O(n.log n)

We add everything to get the time complexity, but highest is O(n.log n) so that will be the overall complexity.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
    for(int i=0; i<n; i++){
    	int number = in.nextInt();
    	if(m1.containsKey(number)){
    		m1.put(number, m1.get(number) + 1);
    	}
    	else {
    		m1.put(number, 1);
    	}
    }
    //System.out.println(m1);

    int m = in.nextInt();
    Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
    for(int i=0; i<m; i++){
    	int number = in.nextInt();
    	if(m2.containsKey(number)){
    		m2.put(number, m2.get(number) + 1);
    	}
    	else {
    		m2.put(number, 1);
    	}
    }
    //System.out.println(m2);

    List<Integer> al = new ArrayList<Integer>();

    for(Map.Entry<Integer, Integer> me : m2.entrySet()){
    	if(m1.containsKey(me.getKey())){
    		if(m2.get(me.getKey()) - m1.get(me.getKey()) > 0){
    			al.add(me.getKey());
    		}
    	}
    	else if(!m1.containsKey(me.getKey())){
    		al.add(me.getKey());
    	}
    }

    Collections.sort(al);

    Iterator itr = al.iterator();
    while(itr.hasNext()){
    	System.out.print(itr.next() + " ");
    }

    }
}
