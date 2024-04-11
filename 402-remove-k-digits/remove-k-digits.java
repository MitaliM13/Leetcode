class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
       for(char n:num.toCharArray()){
        while(!st.isEmpty() && k>0 && st.peek()>n){
            st.pop();
            k--;
        }
        st.push(n);
       }
       while(k>0 && !st.isEmpty()){
        st.pop();
        k--;
       }
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.pop());
       }
       sb.reverse();
       while(sb.length() > 0 && sb.charAt(0) == '0'){
        sb.deleteCharAt(0);
       }
       return sb.length()>0 ? sb.toString() : "0";
    }
}