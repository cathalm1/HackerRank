package hckr;
import java.io.*;
import java.util.*;

public class Solution_Arrays_Left_Rotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d){
        int count=0;
        ArrayList<Integer>ar=new ArrayList<Integer>();
        for(int p=0;p<a.length;p++){
            ar.add(a[p]);
        }
        while(count!=d){
            int r=ar.get(0);
            ar.add(r);
            ar.remove(0);
            count++;
        }
        for(int u=0;u<a.length;u++){
            a[u]=ar.get(u);
        }
        return a;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

       for(int j =0; j < result.length; j++){
            System.out.print(result[j] + " ");
        }
    }
}

/*
test cases

5 4
1 2 3 4 5
=========
5 1 2 3 4

 */
