package hckr;

public class Solution_AlternatingCharacters {
    public static void main(String args[]){
        String s = "";
        alternatingCharacters(s);
    }

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int c = 0, i = 1;
        char t = s.charAt(0);

        while(i < s.length()){
            if(s.charAt(i)==t){
                c++;
            } else{
                t = s.charAt(i);
            } i++;
        }

        return c;
    }
}


/*

input
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

result
3
4
0
0
4
 */

