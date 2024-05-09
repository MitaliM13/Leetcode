class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long max = 0;
        int n = happiness.length; 
        int dec = 0;
        Arrays.sort(happiness);
        for(int i = n-1; i>=n-k; i--){
            max += Math.max(0,happiness[i]-dec);
            dec++;
        }
        return max;
    }
}