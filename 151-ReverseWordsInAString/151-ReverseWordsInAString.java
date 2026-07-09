// Last updated: 09/07/2026, 09:12:57
class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String o="";
        for(int i=str.length-1;i>0;i--){
            o+=str[i]+" ";
        }
        return o+str[0];
    }
}