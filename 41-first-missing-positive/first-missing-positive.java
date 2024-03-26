class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap <Integer, Boolean> mp = new HashMap<>();
        int maxInt = Integer.MIN_VALUE;
        for(int n:nums){
            mp.put(n,true);
            maxInt = Math.max(maxInt,n);
        }
        for(int i = 1; i<maxInt; i++){
            if(!mp.containsKey(i))
            return i;
        }
        return maxInt < 0 ? 1 : maxInt + 1;
    }
}