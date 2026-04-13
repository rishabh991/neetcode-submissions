class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        int[] r = new int[nums.length];

        a[0] = 1;
        b[nums.length-1] = 1;

        for(int i=1; i<nums.length; i++){
            a[i] = a[i-1]*nums[i-1];
            b[nums.length-1-i] = b[nums.length-i]*nums[nums.length-i];
        }

        for(int j=0; j<nums.length; j++){
            r[j] = a[j]*b[j];
        }

        return r;
    }
}  
