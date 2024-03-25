class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        char c[] = n.toCharArray();
        for(int i = 0; i< c.length; i ++){
            if(max < c[i] - '0') max = c[i]-'0';
        }
        return max;
    }
}