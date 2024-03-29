class Solution {
    public long countSubarrays(int[] nums, int k) {
        long l = 0 , ri = 0;
        long max = Long.MIN_VALUE;
        long count = 0;
        long ans = 0;

        for(int n : nums){
            max = Math.max(max,n);
        }
        while(ri < nums.length || l > ri){
            if(nums[(int)ri] == max){
                count ++;
            }
            while (count>= k){
                if(nums[(int)l] == max){
                    count --;
                }
                l ++;
                ans += nums.length - ri;
            }
            ri++;
        }
        return ans;
    }
}