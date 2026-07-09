// Last updated: 09/07/2026, 09:11:16
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3>=2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}