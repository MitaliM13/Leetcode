class Solution {
    public int trap(int[] heigth) {
        int i = 0, j = heigth.length - 1;
        int left = heigth[0]; int right = heigth[j];
        int count = 0;
        while(j>i){
            if(left<=right){
                count+=(left-heigth[i]);
                    i++;
                    left = Math.max(left,heigth[i]);
                } else{
                count += (right - heigth[j]);
                j--;
                right = Math.max(right,heigth[j]);
            }
        }
        return count;
    }
}