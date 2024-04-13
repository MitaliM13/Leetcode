public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> jumps = new PriorityQueue<>();

        for (int i = 1; i < heights.length; i++) {
            int difference = heights[i] - heights[i - 1];

            if (difference > 0) {
                bricks -= difference;
                jumps.offer(-difference);

                if (bricks < 0) {
                    if (ladders == 0) {
                        return i - 1;
                    } else {
                        bricks += Math.abs(jumps.poll());
                        ladders--;
                    }
                }
            }
        }
        return heights.length - 1;
    }
}