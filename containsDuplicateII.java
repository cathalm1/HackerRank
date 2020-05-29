class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int p = 0;
        for(int i : nums) {
            if(map.containsKey(i) && p - map.get(i) <= k) {
                return true;
            } else {
                map.put(i, p);
            }
            p++;
        }
        
        return false;
    }
}
