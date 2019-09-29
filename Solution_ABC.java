package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_ABC {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] alphabetS = scan.nextLine().split(" ");
        String ABCorder = scan.nextLine();
        int[] alphabetI = new int[3];
        alphabetI[0] = Integer.parseInt(alphabetS[0]);
        alphabetI[1] = Integer.parseInt(alphabetS[1]);
        alphabetI[2] = Integer.parseInt(alphabetS[2]);
        Arrays.sort(alphabetI);
        int i = 0;
        while(i < 3) {
            if(ABCorder.charAt(i) == 'A') System.out.print(alphabetI[0] + " ");
            else if(ABCorder.charAt(i) == 'B') System.out.print(alphabetI[1] + " ");
            else System.out.print(alphabetI[2] + " ");
            i++;
        }
    }
}
