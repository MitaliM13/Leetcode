class Solution {

    public static boolean possible(int[] arr, int days, int m, int k){
        int n = arr.length;
        int count = 0;
        int noOfBq = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] <= days){
                count ++;
            } else {
                noOfBq += (count/k);
                count = 0;
            }
        }
        noOfBq += (count/k); 
        return noOfBq >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;
        long val = (long) m*k;
        if(val > n) return -1;

        int minI = Integer.MAX_VALUE, maxI = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            minI = Math.min(minI, bloomDay[i]);
            maxI = Math.max(maxI, bloomDay[i]);
        }

        int low = minI, high = maxI;
        while(low<= high){
            int mid = low + (high - low) / 2;
            if(possible(bloomDay, mid, m, k)){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}