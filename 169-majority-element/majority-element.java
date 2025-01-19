class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            int  value = mp.getOrDefault(nums[i],0);
            mp.put(nums[i], value+1);
        }

        for(Map.Entry <Integer, Integer> val: mp.entrySet()){
            if(val.getValue() > n/2){
                return val.getKey();
            }
        }
        return -1;
    }
}