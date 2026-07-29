// Last updated: 29/07/2026, 14:44:30
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int m=0;
        int c=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                c++;
            }
        }
        m=c;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                c++;
            }
            if(blocks.charAt(i-k)=='W'){
                c--;
            }
            m=Math.min(c,m);
        }
        return m;
    }
}