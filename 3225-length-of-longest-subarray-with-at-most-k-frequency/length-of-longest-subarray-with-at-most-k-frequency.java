class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         int res = 0;
         int left = 0;
         HashMap<Integer, Integer> un = new HashMap <>();

        for(int ri = 0; ri<nums.length; ri++){
            un.put(nums[ri], un.getOrDefault(nums[ri], 0)+1);
            while(un.get(nums[ri]) > k){
                un.put(nums[left], un.get(nums[left])-1);
                left++;
            }
            res = Math.max(res, ri - left + 1);
        }        
        return res;
    }
}