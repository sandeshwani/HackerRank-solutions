import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int A_to_C = Math.abs(z - x);
            int B_to_C = Math.abs(z - y);
            if (A_to_C < B_to_C) {
                System.out.println("Cat A");
            } 
            else if (A_to_C > B_to_C) {
                    System.out.println("Cat B");
            } 
            else {
                System.out.println("Mouse C");
            }
        }
    }
}

