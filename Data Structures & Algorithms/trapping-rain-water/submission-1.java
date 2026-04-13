class Solution {
    public int trap(int[] height) {
        
        int l=0;
        int r=height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int water = 0;

        while(l<r){
            if(height[l]<height[r]){
                l++;
                leftMax = Math.max(height[l],leftMax);
                water+=leftMax-height[l];
            }else{
                r--;
                rightMax=Math.max(height[r],rightMax);
                water+=rightMax-height[r];
            }
        }
        return water;
    }
}
