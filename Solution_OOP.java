package Kattis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_OOP {
    public static String[] alphabet;

    public static void main(String args[]) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String NQ[] = scan.readLine().split(" ");
        int N = Integer.parseInt(NQ[0]);
        int Q = Integer.parseInt(NQ[1]);

        alphabet = new String[N];
        int i = 0, pos = 0;

        while(i < N) {
            alphabet[pos++] = scan.readLine();
            i++;
        }int w=0;
        while(w!=Q) {
            String in = scan.readLine();
            int count = 0, star = 0;

            if(in.length() == 1 && in.compareTo("*")==0) count = alphabet.length;

            else {
                String left = "", right = "";
                star = in.indexOf(String.valueOf('*'));
                left = in.substring(0, star);
                right = in.substring(star + 1);

                if(in.charAt(0)== '*'){
                    for (String o : alphabet) {
                        if(o.charAt(o.length()-1) == right.charAt(right.length()-1) && o.endsWith(right)) count++;
                    }

                } else if(in.charAt(in.length()-1) == '*'){
                    for (String u : alphabet) {
                        if(u.charAt(0) == left.charAt(0) && u.startsWith(left)) count++;
                    }

                } else {
                    for (String p : alphabet) {
                        if (p.charAt(0) == left.charAt(0) && p.charAt(p.length()-1) == right.charAt(right.length()-1) && p.length() >= (left.length() + right.length()) && p.startsWith(left) && p.endsWith(right)) count++;
                    }
                }
            }
            System.out.println(count);
            w++;
        }
    }
}
