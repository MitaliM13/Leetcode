class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int prev = -1, left = -1, ri = -1;

        for(int i =0; i<nums.length;i++){
            if(!(minK <= nums[i] && nums[i]<=maxK)){
                prev = i;
            }
            if(nums[i] == minK){
                left = i;
            }
            if(nums[i] == maxK){
                ri = i;
            }
            res +=Math.max(0,Math.min(left,ri)-prev);
        }
        return res;
    }
}