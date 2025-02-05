class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int char1 = -1;
        int char2 = -1;

        int cnt = 0;

        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
                if(char1 == -1) char1 = i;
                else if(char2 == -1) char2 = i;
            }
        }
        if(cnt == 0) return true;
        else if(cnt == 2 && s1.charAt(char1) == s2.charAt(char2) && s1.charAt(char2) == s2.charAt(char1)){
            return true;
        }
        return false;
    }
}