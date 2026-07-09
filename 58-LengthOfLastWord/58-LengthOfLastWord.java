// Last updated: 09/07/2026, 09:13:22
class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '&&c==0){
                continue;
            }
            if(s.charAt(i)==' '){
                break;
            }
            c++;
        }
        return c;
    }
}