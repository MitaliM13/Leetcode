class Solution {
    public int longestIdealString(String s, int k) {
        int[] str = new int[26];
        int  longest = 1;

        for(int i = 0; i<s.length(); i++){
            int ele = s.charAt(i) - 'a';
            for(int j = ele; j >= 0 && j >= ele - k; j--){
                str[ele] = Math.max(str[ele],str[j]+1);
            }

            for(int j = ele+1; j<26 && j <= ele+k; j++){
                str[ele] = Math.max(str[ele],str[j]+1);
            }
            longest = Math.max(longest,str[ele]);
        }
        return longest;
    }
}