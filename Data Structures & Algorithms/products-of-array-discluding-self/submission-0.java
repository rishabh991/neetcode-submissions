class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a1 = new int[nums.length];
        int[] a2 = new int[nums.length];
        int[] res = new int[nums.length];
        int p1=1, p2=1;
        a1[0]=1;
        a2[0]=1;

        for(int i=1; i<nums.length; i++){
            p1*=nums[i-1];
            a1[i]=p1;

            p2*=nums[nums.length-i];
            a2[i]=p2;
        }

        for(int j=0; j<nums.length; j++){
            res[j]=a1[j]*a2[nums.length-1-j];
        }

        return res;

    }
}  
