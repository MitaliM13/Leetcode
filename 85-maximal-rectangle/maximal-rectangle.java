class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0)
        return 0;

        int res = 0;
        int[] hist = new int[matrix[0].length];

        for(char[] row : matrix){
            for (int i = 0; i<row.length;++i)
            hist[i] = row[i] == '0' ? 0 : hist[i] + 1;
            res = Math.max(res,largestRectangleArea(hist));
        }
        return res;
    }
    private int largestRectangleArea(int[] h){
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<= h.length; ++i){
            while(!stack.isEmpty() && (i == h.length || h[stack.peek()]>h[i])){
                final int a = h[stack.pop()];
                final int w = stack.isEmpty()? i: i - stack.peek() - 1;
                res = Math.max(res, a*w);
            }
            stack.push(i);
        }
        return res;
    }
}