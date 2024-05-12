class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().replaceAll(" +"," ").split(" ");
        StringBuilder Ans = new StringBuilder();

        for(int i = arr.length - 1; i>=0; i--){
            Ans.append(arr[i] + " ");
        }
        return Ans.toString().trim();
    }
}