class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        ArrayList <Integer> ans = new ArrayList<>(Collections.nCopies(n,0));

        int posInd = 0, negInd = 1;
        for(int i = 0; i<n; i++){
            if(nums[i] < 0){
                ans.set(negInd, nums[i]);
                negInd += 2;
            } else {
                ans.set(posInd, nums[i]);
                posInd += 2;
            }
        }
        int res[] = new int[n];
        for(int i = 0; i<n; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}