class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> prodCount = new HashMap<>();
        int res = 0;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int prod = nums[i]*nums[j];
                res += 8 * prodCount.getOrDefault(prod,0);
                prodCount.put(prod, prodCount.getOrDefault(prod, 0)+1);
            }
        }
        return res;
    }
}