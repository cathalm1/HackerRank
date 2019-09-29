package Kattis;

import java.util.Scanner;

public class Solution_3D_Printer {
    //Euler's formula = V - E + F = 2
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double r = (Math.log(scan.nextDouble()))/(Math.log(2));
        r = Math.ceil(r) + 1;
        System.out.println(r);
    }
}
