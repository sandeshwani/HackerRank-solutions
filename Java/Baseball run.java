import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	/*
     * Complete the function below.
     */
	static int totalRuns(int[] batterSpeedLimits, int[][] pitchSpeeds)      {
	    
        int a = batterSpeedLimits.length;
    	if (a < 4){
    		return 0;
        
    	}
    	int run = 0;
        int base = 0;
    	for(int i=0; i<a; i++){
    		for(int j=0; j<3; j++){
    			if(batterSpeedLimits[i] >= pitchSpeeds[i][j]){
                    base++;
                    if(base >3){
                        run++;
                    }
                    break;
        		}
    		}
    		
    	}
    	return run;
        
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int batterSpeedLimits_size = 0;
        batterSpeedLimits_size = Integer.parseInt(in.nextLine().trim());

        int[] batterSpeedLimits = new int[batterSpeedLimits_size];
        for(int i = 0; i < batterSpeedLimits_size; i++) {
            int batterSpeedLimits_item;
            batterSpeedLimits_item = Integer.parseInt(in.nextLine().trim());
            batterSpeedLimits[i] = batterSpeedLimits_item;
        }

        int pitchSpeeds_rows = 0;
        int pitchSpeeds_cols = 0;
        pitchSpeeds_rows = Integer.parseInt(in.nextLine().trim());
        pitchSpeeds_cols = Integer.parseInt(in.nextLine().trim());

        int[][] pitchSpeeds = new int[pitchSpeeds_rows][pitchSpeeds_cols];
        for(int pitchSpeeds_i = 0; pitchSpeeds_i < pitchSpeeds_rows; pitchSpeeds_i++) {
            for(int pitchSpeeds_j = 0; pitchSpeeds_j < pitchSpeeds_cols; pitchSpeeds_j++) {
                pitchSpeeds[pitchSpeeds_i][pitchSpeeds_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
          in.nextLine();
        }

        res = totalRuns(batterSpeedLimits, pitchSpeeds);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}

