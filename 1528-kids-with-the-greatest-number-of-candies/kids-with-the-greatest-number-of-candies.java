class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int maxCan = 0;
       for(int candy : candies){
            maxCan = Math.max(candy,maxCan);
       }
       List<Boolean> res = new ArrayList<>();
       for(int candy : candies){
            res.add(candy+extraCandies>=maxCan);
       }
       return res;
    }
}