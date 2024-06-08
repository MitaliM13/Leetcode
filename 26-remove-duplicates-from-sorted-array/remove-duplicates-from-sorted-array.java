class Solution {
    public int removeDuplicates(int[] nums) {
        int dup = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                nums[dup] = nums[i];
                dup++;
            }
        }
        return dup;
    }
}