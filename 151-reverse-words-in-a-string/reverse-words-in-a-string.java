class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().replaceAll(" +"," ").split(" ");
        StringBuilder Ans = new StringBuilder();

        for(int i = str.length - 1; i>=0; i--){
            Ans.append(str[i] + " ");
        }
        return Ans.toString().trim();
    }
}