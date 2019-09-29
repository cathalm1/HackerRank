package hckr;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution_Maximum_XOR {

    // Complete the maxXor function below.
    static int[] maxXor(int[] arr, int[] queries) {
        int retArray[] = new int [queries.length];
        int query=0;
        while( query < queries.length) {
            int i =0;
            int maxno = Integer.MIN_VALUE;
            while(i < arr.length){
                int r = queries[query]^arr[i];
                if(r > maxno) maxno = r;
                i++;
            }
            retArray[query] = maxno;
            query++;
        }
        return retArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();

        int[] queries = new int[m];

        for (int i = 0; i < m; i++) {
            int queriesItem = scanner.nextInt();
            queries[i] = queriesItem;
        }

        int[] result = maxXor(arr, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            if (i != result.length - 1) {
                System.out.println("\n");
            }
        }
        scanner.close();
    }
}
