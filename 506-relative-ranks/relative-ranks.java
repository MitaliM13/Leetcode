class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = score.length;
        for (int i = 0; i < n; i++) map.put(score[i],i);
        Arrays.sort(score);
        String[] ans = new String[n];
        for (int i = 0; i < n; i++){
            int ind = map.get(score[i]);
            if (i == n-1) ans[ind] = "Gold Medal";
            else if (i == n-2) ans[ind] = "Silver Medal";
            else if (i == n-3) ans[ind] = "Bronze Medal";
            else ans[ind] = String.valueOf(n-i); 
        }
        return ans;
    }
}