class Solution {

    public static List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansR = new ArrayList<>();
        ansR.add(1);
        for(int i = 1; i<row; i++){
            ans = ans*(row-i);
            ans = ans/i;
            ansR.add((int)ans);
        }
        return ansR;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<=numRows; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}