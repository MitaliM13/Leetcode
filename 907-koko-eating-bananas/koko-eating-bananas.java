class Solution {

    public static int findMax(int[] a){
        int maxInt = Integer.MIN_VALUE;
        int n = a.length;
        
        for(int i = 0; i<n; i++){
            maxInt = Math.max(maxInt, a[i]);
        }
        return maxInt;
    }

    public static int totalHours(int[] a,int h){
        int totalH = 0;
        int n = a.length;

        for(int i = 0; i<n; i++){
            totalH += Math.ceil((double)a[i]/ (double)h);
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);

        while(low <= high){
            int mid = low + (high - low)/2;
            int hours = totalHours(piles, mid);

            if(hours <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}