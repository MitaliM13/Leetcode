class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(nums[i]);
        }
        if(set.size() < n){
            return true;
        }
        return false;
    }
}