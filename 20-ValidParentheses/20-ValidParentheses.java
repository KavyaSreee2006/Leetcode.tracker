// Last updated: 09/07/2026, 09:13:35
class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        char[] stack = new char[length];
        int stackTop = -1;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack[++stackTop] = ')';
            } else if (ch == '[') {
                stack[++stackTop] = ']';
            } else if (ch == '{') {
                stack[++stackTop] = '}';
            } else {
                if (stackTop < 0 || ch != stack[stackTop--]) return false;
            }
        }
        return stackTop == -1;
    }
}