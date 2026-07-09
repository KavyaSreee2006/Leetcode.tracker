// Last updated: 09/07/2026, 09:11:20
class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
}