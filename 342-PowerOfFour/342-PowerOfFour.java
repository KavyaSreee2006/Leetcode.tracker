// Last updated: 09/07/2026, 09:12:22
class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<128;i++){
            if(Math.pow(4,i)==n){
                return true;
            }
        }
        return false;
    }
}