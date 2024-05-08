class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue <Integer> rank = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : score){
            rank.offer(i);
        }
        Map<Integer, String> map = new HashMap<>();
        int index = 1;
        while(!rank.isEmpty()){
            if(index == 1){
                map.put(rank.remove(), "Gold Medal");
            } else if(index == 2){
                map.put(rank.remove(), "Silver Medal");
            } else if(index == 3){
                map.put(rank.remove(), "Bronze Medal");
            } else {
                map.put(rank.remove(), Integer.toString(index));
            }
            index ++;
        }
        String [] res = new String[score.length];
        for(int i = 0; i<res.length; i++){
            res[i] = map.get(score[i]);
        }
        return res;
    }
}