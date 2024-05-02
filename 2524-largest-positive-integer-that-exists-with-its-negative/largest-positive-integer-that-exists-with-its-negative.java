class Solution {
    public int findMaxK(int[] nums) {
        HashSet <Integer>large = new HashSet<>();
        int ans = -1;
        for(int num : nums ){
            large.add(num);
            int k = num*(-1);
            if(large.contains(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans;
    }
}