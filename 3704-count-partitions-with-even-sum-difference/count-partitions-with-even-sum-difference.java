class Solution {
    public int countPartitions(int[] nums) {
        int n =  nums.length;
        int totalSum = 0;
        int cnt = 0;

        for(int i = 0; i<n; i++){
            totalSum += nums[i];
        }

        int leftS = 0;

        for(int i = 0; i<n-1; i++){
            leftS += nums[i];
            int diff = totalSum - leftS;
            if((leftS % 2) == (diff%2)){
                cnt++;
            }
        }
        return cnt;
    }   
}