// Last updated: 07/09/2026, 14:28:39
class Solution {
    public int tribonacci(int n) {
        int f1=0,f2=1,f3=1,f4=0;
        if(n==1){
            return n;
        }if(n==2){
            return 1;
        }
        while(n-2>0){
            f4=f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
            n--;

        }
        return f4;
    }
}