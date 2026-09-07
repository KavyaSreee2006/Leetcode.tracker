// Last updated: 07/09/2026, 14:28:14
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<target.length;i++){
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}