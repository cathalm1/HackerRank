package hckr;

public class Solution_Anangram {
    public static void main(String args[]){

        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println(makeAnagram(a, b));
    }

    // Complete the makeAnagram function below.
    public static int makeAnagram(String a, String b) {
        int [] ar = new int[26];
        int c = 0;

        if(a.equals(b)) return 0;
        else
            ar = getFreq(a, ar, "++");
            ar = getFreq(b, ar, "--");
            for (int i : ar) {
                c += Math.abs(i);
            }
            return c;
    }

    public static int[] getFreq(String in, int[] ar, String s){
        for(int i = 0; i < in.length(); i++){
            if(s.equals("++")) ar[in.charAt(i)-(int)'a']++;
            else ar[in.charAt(i)-(int)'a']--;
        } return ar;
    }
}
