class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(); 
        int min = Integer.MAX_VALUE, i = 0;
        for(char c : s.toCharArray()) {
            if(map.get(c) != null) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
            i++;
        }
        
        for(char c : s.toCharArray()) {
            if(map.get(c) < min && map.get(c) > -1) {
                min = map.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
