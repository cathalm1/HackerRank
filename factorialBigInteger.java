import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        System.out.println(factorial(new BigInteger(n+"")));
    }

    static BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        return  n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
 
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
