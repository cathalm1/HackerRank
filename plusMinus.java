import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        int cn = 0, cz = 0, cp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) cn++;
            else if(arr[i] == 0) cz++;
            else if(arr[i] > 0) cp++;
        }
        System.out.println(df.format((double) cp/arr.length));
        System.out.println(df.format((double) cn/arr.length));
        System.out.println(df.format((double) cz/arr.length));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
