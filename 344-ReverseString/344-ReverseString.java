// Last updated: 09/07/2026, 09:12:21
class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();

        for(char c: s){
            st.push(c);
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = st.pop();
        }
    }
}