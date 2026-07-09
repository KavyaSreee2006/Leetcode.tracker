// Last updated: 09/07/2026, 09:13:06
class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                str=str+ch;
            }
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
             rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}