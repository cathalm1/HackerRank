class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int noj = 0;
        for(char c : J.toCharArray()) {
            set.add(c);
        }
        
        for(char c : S.toCharArray()) {
            if(set.contains(c)) noj++;
        }
        
        return noj;   
    }
}
