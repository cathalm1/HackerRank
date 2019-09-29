package hckr;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
for(int i=0;i<q.length;i++){
            System.out.println(q[i]);
        }
 */

public class Solution_New_Years_Chaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int i = 0, count = 0;
        boolean r = false;
        while (i != q.length) {
            if ((Math.abs(q[i] - (i + 1))) > 2 && q[i]>i+1) {
                r = true;
                break;
            }
            if (q[i] != (i + 1) && q[i]>i+1) {
                count+=Math.abs(q[i] - (i + 1));
                if(q[i]==(q[i+1])+1)count++;
            }
            i++;
        }
        if (!r) {
            //if (count % 2 == 1) System.out.println((count / 2) + (count % 2));
            System.out.println((count) + 1);
        } else {
            System.out.print("Too chaotic");
        }
    }

    public static void solver(int[] q) {
        int bribe = 0;
        boolean chaotic = false;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        if (chaotic)
            System.out.println("Too chaotic 22");
        else
            System.out.println(bribe);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
            //solver(q);
        }

        scanner.close();
    }
}

/*
test cases
2
5
2 1 5 3 4
5
2 5 1 3 4


2
8
5 1 2 3 7 8 6 4
8
1 2 5 3 7 8 6 4



 */