// Last updated: 09/07/2026, 09:12:06
class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            char ch=chars[i];
            int c=0;
            while(i<chars.length && chars[i]==ch){
                i++;
                c++;
            }
            chars[index++]=ch;
            if(c>1){
                String s=String.valueOf(c);
                for(char d:s.toCharArray()){
                    chars[index++]=d;
                }
            }
        }
        return index;
    }
}