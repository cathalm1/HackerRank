package Kattis;

import java.util.Scanner;

public class Solution_A_List_Game {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Eyes(scan.nextLong()));
        System.out.println(4%1000000007);

    }
    public static long Eyes(long in) {
        long count = 0L, factor = 2L;
        while(Math.pow(factor, 2) <= in) {
            if(in % factor == 0L) {
                in /= factor;
                count ++;
            } else factor++;
        }
        return count+1;
    }
}