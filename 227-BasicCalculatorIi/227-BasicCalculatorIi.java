// Last updated: 09/07/2026, 09:12:40
class Solution {
    public int calculate(String s) {
        int res=0;
        int lst=0;
        int num=0;
        char op='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if((!Character.isDigit(ch)&&ch!=' ') || i==s.length()-1){
                switch(op){
                    case '+':
                        res += lst;
                        lst=num;
                        break;
                    case '-':
                        res += lst;
                        lst= -num;
                        break;
                    case '*':
                        lst=lst*num;
                        break;
                    case '/':
                        lst=lst/num;
                        break;
                }
                op=ch;
                num=0;
            }
        }
        return res+lst;
    }
}