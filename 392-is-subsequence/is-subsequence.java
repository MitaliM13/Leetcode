class Solution {
    public boolean isSubsequence(String s, String t) {
        int sstr = 0;
        int tstr = 0;

        while(sstr<s.length() && tstr<t.length()){
            if(s.charAt(sstr) == t.charAt(tstr)){
                sstr++;
            }
            tstr++;
        }
        return sstr == s.length();
    }
}