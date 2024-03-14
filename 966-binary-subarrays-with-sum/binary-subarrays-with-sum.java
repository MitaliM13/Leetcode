class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int result = 0;
        int preSum = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int i=0; i<n; i++){
            preSum += nums[i];
            result += map.getOrDefault(preSum - goal, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) +1);
        }
        return result;
    }
}