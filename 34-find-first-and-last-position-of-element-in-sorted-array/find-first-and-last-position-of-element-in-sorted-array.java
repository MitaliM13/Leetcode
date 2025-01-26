class Solution {

    public int first(int[]nums, int target){
        int n = nums.length;
        int ans = -1;

        int low = 0, high = n-1;

        while(low<=high){
            int mid = low+ (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            } else if (nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    } 
    public int last(int[]nums, int target){
        int n = nums.length;
        int ans = -1;

        int low = 0, high = n-1;

        while(low<=high){
            int mid = low+ (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }  else if (nums[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    } 

    public int[] searchRange(int[] nums, int target) {
        int ans = -1;

        int f = first(nums, target);
        int l = last(nums, target);

        return new int[] {f, l};
    }
}