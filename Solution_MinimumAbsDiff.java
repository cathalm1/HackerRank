package hckr;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_MinimumAbsDiff {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String [] x = s.nextLine().split(" ");
        int[] ar = Arrays.stream(x).mapToInt(Integer::parseInt).toArray();
        System.out.println(minimumAbsoluteDifference(ar));

    }

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int l = Integer.MAX_VALUE, r = 0;
        for(int i = 1; i < arr.length; i++){
            r = Math.abs(arr[i] - arr[i-1]);
            if(r < l) l = r;
        }
        return l;
    }
}

/*


3 -7 0

output 3


 */