class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder rev = new StringBuilder(word);
        int first = word.indexOf(ch);
        int start = 0;
        int end = first;
        while(start<end){
            swap(rev,start,end);
            start++;
            end--;
        }
        return rev.toString();
    }
    void swap(StringBuilder rev, int i, int j){
        char temp = rev.charAt(i);
        rev.replace(i,i+1, ""+rev.charAt(j));
        rev.replace(j,j+1, ""+temp);
    }
}