class Solution {
    public void moveZeroes(int[] nums) {
      int a = 0;
      int b = 0;

      while(a<nums.length){
        if(nums[a] != 0){
            int temp = nums[b];
            nums[b] = nums[a];
            nums[a] = temp;
            b++;
        }
        a++;
      }
    }
}