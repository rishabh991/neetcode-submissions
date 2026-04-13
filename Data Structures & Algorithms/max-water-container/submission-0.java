class Solution {
    public int maxArea(int[] heights) {
        
        int area=0;
        int result=0;
        int l=0;
        int r=heights.length-1;

        while(l<r){

            area=Math.min(heights[l],heights[r])*(r-l);
            result=Math.max(result,area);

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }

        }

        return result;
    }
}
