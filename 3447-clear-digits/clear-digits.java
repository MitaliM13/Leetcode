class Solution {
    public String clearDigits(String s) {
        char[] stack = new char[s.length()];
        int index = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(index > 0){
                    index --;
                } 
            } else {
                stack[index++] = c;
            }
        }
        return new String(stack, 0, index);
    }
}