class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length() != t.length()) return false;

     int [] m1 = new int[200];
     int [] m2 = new int[200];

     for(int i = 0; i<s.length(); i++){
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);

        if(m1[sChar] != m2[tChar]) return false;

        m1[sChar] = i+1;
        m2[tChar] = i+1;
     }
     return true;
    }
}