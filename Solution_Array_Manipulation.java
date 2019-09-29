package hckr;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution_Array_Manipulation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);

        scanner.close();
    }

    // Complete the arrayManipulation function below.
     static long arrayManipulation(int n, int[][] queries) {
        long [] temp = new long[n];
        int i = 0;
        while(i < queries.length){
            int start = queries[i][0];
            int end = queries[i][1];
            long key = (long)queries[i][2];
            temp[start-1] += key;
            if(end < n) temp[end] -= key;
            i++;
        }

         long largest = Long.MIN_VALUE, t = 0L;
         for (long l:temp) {
             t += l;
             if(t > largest)largest = t;
         }
        return largest;
    }
}
