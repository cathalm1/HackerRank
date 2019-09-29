package Kattis;

import java.util.Scanner;

public class Solution_3D_Printed_Statues {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println(days(scan.nextInt()));
    }
    public static int days(int statues) {
        int printers = 1, days = 0;
        while(printers < statues) {
            printers *= 2;
            days += 1;
        }
        days += 1;
        return days;
    }
}
