class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        
        Map<Integer, Integer> ballCol = new HashMap<>();
        Map<Integer, Integer> colFreq = new HashMap<>();
        int[] res = new int [n];
        int distCol = 0;

        for(int i = 0; i<n; i++){
            int ball = queries[i][0], color = queries[i][1];

            if(ballCol.containsKey(ball)){
                int oldCol = ballCol.get(ball);
                colFreq.put(oldCol, colFreq.get(oldCol) - 1);

                if(colFreq.get(oldCol) == 0){
                    colFreq.remove(oldCol);
                    distCol--;
                }
            }            
            ballCol.put(ball, color);

            colFreq.put(color, colFreq.getOrDefault(color,0)+1);

            if(colFreq.get(color) == 1){
                distCol++;
            }
            res[i] = distCol;
        }
        return res;
    }
}