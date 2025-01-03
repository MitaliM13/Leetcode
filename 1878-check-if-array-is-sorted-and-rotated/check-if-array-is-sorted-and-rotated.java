class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int sorted = 0;
        if(nums[0] < nums[n-1]){
            sorted++;
        }
        for(int i = 1; i<n; i++){
            if(nums[i-1] > nums[i]){
                sorted++;

                if(sorted>1){
                    return false;
                }
            }
        }
        return true;
    }
}