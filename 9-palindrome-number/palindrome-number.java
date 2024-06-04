class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }   
        long revDig = 0;
        long temp = x;

        while(temp != 0){
            int last = (int)(temp%10);
            revDig = revDig*10 + last;

            temp/=10;
        }
        return (revDig == x);
        
    }
}