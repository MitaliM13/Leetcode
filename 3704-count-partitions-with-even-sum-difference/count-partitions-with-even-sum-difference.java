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
            int diff = leftS- totalSum - leftS;
            if(diff%2 == 0){
                cnt++;
            }
        }
        return cnt;
    }   
}