class Solution {
    public int[] twoSum(int[] numbers, int target) {
        var left = 0;
        var right = numbers.length - 1;
        var sum = numbers[left] + numbers[right];
        while(sum != target){
            if(sum > target){
                right --;
            }else{
                left ++;
            }
            sum = numbers[left] + numbers[right];
        };
        return new int[] {++left, ++right};
    }
}