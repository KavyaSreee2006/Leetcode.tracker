// Last updated: 09/07/2026, 09:11:01
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}