class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long max = 0;
        int val = 0; 
        int dec = 0;
        Arrays.sort(happiness);
        for(int i = happiness.length-1; i>=happiness.length-k; i--){
            val = happiness[i] - dec;
            dec++;
            if(val>0){
                max += val;
            }
        }
        return max;
    }
}