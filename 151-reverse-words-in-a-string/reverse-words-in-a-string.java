class Solution {
    public String reverseWords(String s) {
        Stack <String> st = new Stack<>();
        String word = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(!word.isEmpty()){
                    st.push(word);
                    word = "";
                }
            } else {
                word += s.charAt(i);
            }
        }

        if(!word.isEmpty()){
            st.push(word);
        }

        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
            if(!st.isEmpty()){
                ans += " ";
            }
        }
        return ans;
    }
}