import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if(s.length()==1 && s.charAt(0) == 'a') return n;
        if(!s.contains("a")) return 0;
        long result = 0;
        long nA = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a')nA++;
        }
        long g = n % s.length();
        for(int i = 0; i < g; i++) {
            if(s.charAt(i)=='a')result++;
        }
        result += nA*(n/s.length());
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
