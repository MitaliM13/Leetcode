

import static java.lang.System.err;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n < 2){
            for(int i = 0; i < n; i++){
                res.add(i);
            }
            return res;
        }

         ArrayList<Set<Integer>> neighbors = new ArrayList<>();
         for(int i = 0; i < n; i ++){
             neighbors.add(new HashSet<Integer>());
         }
         for (int[] edge : edges) {
            Integer start = edge[0], end = edge[1];
            neighbors.get(start).add(end);
            neighbors.get(end).add(start);
        }
         ArrayList<Integer> leaves = new ArrayList<>();
         for(int i = 0; i < n; i ++){
             if(neighbors.get(i).size() == 1)
                leaves.add(i);
         }
         int remain = n;

         while(remain > 2){
             remain = remain - leaves.size();
             ArrayList<Integer> newLeaves = new ArrayList<>();
             for(Integer leaf : leaves){
                 for(Integer neighbor : neighbors.get(leaf)){
                     neighbors.get(neighbor).remove(leaf);
                     if(neighbors.get(neighbor).size() == 1)
                        newLeaves.add(neighbor);
                 }
             }
             leaves = newLeaves;

         }
         return leaves;
    }
}