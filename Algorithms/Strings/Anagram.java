import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int anagram(String s){
        // Complete this function

    	if(s.length() % 2 != 0 ){
    		return -1;
    	}
    	//System.out.println("First string: "+ (s.substring(0, s.length()/2)).length() + " " + s.substring(0, s.length()/2));

    	Map<Character, Integer> m1 = new LinkedHashMap<Character, Integer>();
    	for(int i = 0; i < s.length()/2; i++ ){
    		if(m1.containsKey(s.charAt(i))){
    			m1.put( s.charAt(i), m1.get(s.charAt(i)) + 1 );
    		}
    		else {
    			m1.put(s.charAt(i), 1);
    		}

    	}
    	 /*for(Map.Entry m:m1.entrySet()){
    		   System.out.println(m.getKey()+" "+m.getValue());
    		  }*/
    	//System.out.println(m1);

    	//System.out.println("Second String:"+ ( s.substring(s.length()/2, s.length())).length() +" " + s.substring(s.length()/2, s.length()));

    	Map<Character, Integer> m2 = new LinkedHashMap<Character, Integer>();
    	for(int i = s.length()/2; i < s.length(); i++ ){
    		if(m2.containsKey(s.charAt(i))){
    			m2.put( s.charAt(i), m2.get(s.charAt(i)) + 1 );
    		}
    		else {
    			m2.put(s.charAt(i), 1);
    		}

    	}

    	/*for(Map.Entry m:m2.entrySet()){
 		   System.out.println(m.getKey()+" "+m.getValue());
 		  }*/
    	//System.out.println(m2);

    	int changes = 0;
    	for(char c: m2.keySet()){
    		if(m1.containsKey(c) && m2.get(c) > m1.get(c)){

    			changes += (m2.get(c) - m1.get(c) );
    			//System.out.println("checking  "+ c + " " +changes);

    		}
    		//System.out.println(m2.get(c));
    		else if(!m1.containsKey(c)) {
    			changes += m2.get(c);
    			//System.out.println("checking for not containing  "+ c + " " +changes);
    		}

    	}
		return changes;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
