class Solution {

    public static int sumOfDiv(int[] nums, int div){
        int n = nums.length; 
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += Math.ceil((double)nums[i]/div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int maxI = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            maxI = Math.max(maxI, nums[i]);
        }

        int low = 1, high = maxI;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(sumOfDiv(nums, mid) <= threshold){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}