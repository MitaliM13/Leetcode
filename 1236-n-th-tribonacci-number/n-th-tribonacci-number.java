class Solution {
    public int tribonacci(int n) {
        if(n<2)
            return n;
        
        int F[] = {0,1,1};

        for(int i = 3; i<=n; i++){
            final int next = F[0]+F[1]+F[2];
            F[0] = F[1];
            F[1] = F[2];
            F[2] = next;
        }
        return F[2];
    }
}