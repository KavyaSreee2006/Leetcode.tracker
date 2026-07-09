// Last updated: 09/07/2026, 09:13:32
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=(haystack.length()-needle.length());i++){
            if((haystack.substring(i,i+needle.length())).equals(needle))
                return i;
        }
        return -1;
    }
}