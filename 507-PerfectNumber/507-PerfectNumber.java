// Last updated: 09/07/2026, 09:11:57
class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                s+=i;
            }
        }
        return s==num;
    }
}