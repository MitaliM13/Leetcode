class Solution {
    public int minimumLength(String s) {
        int pre = 0;
        int suf = s.length()-1;

        while(pre<suf && s.charAt(pre) == s.charAt(suf)){
            char cur = s.charAt(pre);
            while(pre<=suf && s.charAt(pre) == cur){
                pre++;
            }
            while(suf>=pre && s.charAt(suf) == cur){
                suf--;
            }
        }
        return suf-pre +1;
    }
}