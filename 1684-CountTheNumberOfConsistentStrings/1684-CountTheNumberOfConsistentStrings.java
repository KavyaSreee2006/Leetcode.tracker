// Last updated: 07/09/2026, 14:27:48
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean freq[]=new boolean [26];
        for(char ch:allowed.toCharArray()){
            freq[ch-'a']=true;
        }
        int c=0;
        for(String w:words){
            boolean ok=true;
            for(int i=0;i<w.length();i++){
                if(!freq[w.charAt(i)-'a']){
                    ok=false;
                    break;
                }
            }
            if(ok){
                c++;
            }
    }
    return c;
    }
}