class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        
        int start = 0;
        int end = 0;
        int res = 0;
        int pro = 1;

        while(end < nums.length){
            pro *= nums[end];

            while(pro >= k){
            pro /= nums[start];
            start ++;
            }
        res += end-start + 1;
        end++;    
        }
        return res;
    }
}