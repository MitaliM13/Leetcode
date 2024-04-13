class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> queue = new PriorityQueue<>();
        int n = heights.length;
        for (int i = 0; i < n - 1; i++) {
            int d = heights[i + 1] - heights[i];
            if (d <= 0)
                continue;
            queue.offer(d);
            if (queue.size() <= ladders)
                continue;
            d = queue.poll();
            bricks -= d;
            if (bricks < 0)
                return i;
        }
        return n - 1;
    }
}