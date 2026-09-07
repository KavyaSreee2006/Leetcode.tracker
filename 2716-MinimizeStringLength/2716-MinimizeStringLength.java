// Last updated: 07/09/2026, 14:27:05
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}