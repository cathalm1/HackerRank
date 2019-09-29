package hckr;

import java.util.HashSet;
import java.util.Set;

public class Solution_Socks {
    public static void main(String args[]){
        int c[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(socks(c));
    }

    public static int socks(int c[]){
        int m = 0;
        Set<Integer> s = new HashSet<>();
        for (int i: c) {
            if (!s.contains(i)) s.add(i);
            else {m++; s.remove(i);}
        }
        return m;
    }
}
