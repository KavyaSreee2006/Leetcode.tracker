// Last updated: 07/09/2026, 14:29:06
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}