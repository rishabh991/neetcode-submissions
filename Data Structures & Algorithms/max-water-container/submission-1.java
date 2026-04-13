class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int l=0;
        int r=heights.length-1;

        for(int i=0; i<heights.length && l<heights.length && r>0; i++){
            max=Math.max(max, Math.min(heights[l],heights[r])*Math.abs(l-r));
            if(heights[l]<heights[r]){
                l++;
            }else{ //if(l>r){
                r--;
            }
        }

        return max;
    }
}
