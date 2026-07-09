// Last updated: 09/07/2026, 09:12:19
class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();
        String vowels="aeiouAEIOU";
        String rev_vowels="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                sb.append(s.charAt(i));
                count++;
                }    
        }
        rev_vowels=sb.reverse().toString();
        sb = new StringBuffer(s);
        int k=0;
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(sb.charAt(i))!=-1){
                sb.setCharAt(i,rev_vowels.charAt(k++));

            }
        }

        return sb.toString();
        
    }
}