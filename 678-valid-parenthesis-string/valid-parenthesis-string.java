class Solution {
    public boolean checkValidString(String s) {
        int left = 0;
        int ri = 0;

            for(char c : s.toCharArray()){
                if(c == '('){
                    left++;
                    ri++;
                } else if(c == ')'){
                    left--;
                    ri--;
                } else {
                    left--;
                    ri++;
                }
            if (ri < 0) return false;    
            if (left < 0) left = 0;
        }
        return left == 0;
    }
}