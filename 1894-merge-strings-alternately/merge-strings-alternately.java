class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        int m = word1.length(), n = word2.length();

        char result[] = new char[m+n];
        while(i<m || j <n){
            if(i<m) result[k++] = word1.charAt(i++);
            if(j<n) result[k++] = word2.charAt(j++);
        }   
        return new String(result);
    }
}