package hckr;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Solution_HashTablesRansome {
    public static void main(String args[]){
        String [] m = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String [] n = {"ive", "got", "some", "coconuts"};

        Solution(m,n);
    }
    public static Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    public static boolean isValid;

    public static void Solution(String magazine[], String note[]) {

            for (String word : magazine) {
            Integer i = magazineMap.get(word);
            //System.out.print("Integer = " + i);

            if (i == null) {
                magazineMap.put(word, 1);
            } else {
                magazineMap.put(word, i + 1);
            }
        }

        for (String word : note) {
            Integer i = magazineMap.get(word);

            if (i == null || magazineMap.get(word) == 0) {
                isValid = false;
                break;
            } else {
                magazineMap.put(word, i - 1);
            }
        }

        System.out.print(solve());

    }
    public static String solve() {
        if(isValid) return "Yes";
        return "No";
    }
}

/*

7 4
ive got a lovely bunch of coconuts
ive got some coconuts

 */
