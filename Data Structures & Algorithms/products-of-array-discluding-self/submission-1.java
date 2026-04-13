class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] r1 = new int[nums.length];
        r1[0]=1;
        int[] r2 = new int[nums.length];
        r2[nums.length-1]=1;

        int[] res = new int[nums.length];

        for(int i=1; i<nums.length; i++){
            r1[i]=nums[i-1]*r1[i-1];
            r2[nums.length-1-i]=nums[nums.length-1-(i-1)]*r2[nums.length-1-(i-1)];
        }
        for(int i=0; i<nums.length; i++){
            res[i]=r1[i]*r2[i];
        }

        return res;

    }
}  






