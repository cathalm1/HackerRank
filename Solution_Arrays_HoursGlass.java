package hckr;
import java.util.*;
//See HackerRank--PracticeInterview--PreparationKit--Arrays--2D-Array-DS
public class Solution_Arrays_HoursGlass {
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int arr[][]=new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scan.nextLine().split(" ");
            //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int startR=0,startC=0,result=0,max=Integer.MIN_VALUE;

        while(startR!=4) {
            if(startC==4){
                startC=0;
                startR++;
            }
            else {
                result = R13(arr, startR, startC) + R2(arr, startR, startC) + R13(arr, startR + 2, startC);
                if (result > max) {
                    max = result;
                }
                startC++;
            }
        }
        System.out.println(max);

    }
   public static int R13(int arr[][],int startR,int startC){
       return arr[startR][startC]+arr[startR][startC+1]+arr[startR][startC+2];
   }
   public static int R2(int arr[][],int startR,int startC){
       return arr[startR+1][startC+1];
   }

}

//test cases
/*
        -9 -9 -9 1 1 1
        0 -9 0 4 3 2
        -9 -9 -9 1 2 3
        0 0 8 6 6 0
        0 0 0 -2 0 0
        0 0 1 2 4 0

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0
*/
