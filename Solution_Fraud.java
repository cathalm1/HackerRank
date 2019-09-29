package hckr;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class Solution_Fraud {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int []temp = new int[d];
        //int []fin = expenditure;
        //fin = countingSort(fin);

        int median = 0, note = 0, it = 0;


        while(it + d < expenditure.length  ){
            System.out.println("it == "+ (it + d));
            System.out.println("exp == " + expenditure.length);
            int current = it;
            int start=0;
            while(current < (it + d)) {
                temp[start] = expenditure[current];
                System.out.println(temp[start]);
                start++;
                current++;
            }
            System.out.println("evaluating ....");
            temp = countingSort(temp);

            int i=0;
            while(i!=temp.length){
                System.out.print(temp[i]+", ");
                i++;
            }

            if(d%2==0){
                median = temp[(temp.length/2)-1] + temp[temp.length/2];
                median /=2;
            }
            if(d%2==1) {
                median = temp[(temp.length/2)];
            }
            System.out.println("CURRENT == "+ (current));
            if((median*2) >= expenditure[current]){
                note++;
            }
            System.out.println("MEDIAN == "+ median);

            System.out.println("NOTE == "+ note);
            it++;
        }
        return note;
    }

    static int[] countingSort(int [] array) {
        int count[] = new int [201];
        int start = 0;
        while(start!=array.length) {
            count[array[start]]++;
            start++;
        }
        start = 1;
        while(start<=count.length-1) {
            count[start] += count[start-1];
            start++;
        }
        int sorted[] = new int[array.length];
        start = 0;
        while(start!=array.length) {
            sorted[count[array[start]]-1] = array[start];
            count[array[start]]--;
            start++;
        }
        return sorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println("Final == "+result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

*/
        scanner.close();
    }
}

/*

test cases

5 4
1 2 3 4 4

output == 0


9 5
2 3 4 2 3 6 8 4 5

output == 2

 */