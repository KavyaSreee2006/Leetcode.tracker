// Last updated: 09/07/2026, 09:12:04
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=1;
        int e=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>e){
                arrow++;
                e=points[i][1];
            }
        }
        return arrow;
    }
}