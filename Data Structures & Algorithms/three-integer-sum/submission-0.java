class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int l,r,t;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){

            if(i>0 && nums[i]==nums[i-1]) continue;

            l=i+1;
            r=nums.length-1;
            t = -nums[i];

            int sum=0;

            while(l<r){
                sum=nums[l]+nums[r];

                if(sum==t){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));

                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;

                }else if(sum<t){
                    l++;
                }else if(sum>t){
                    r--;
                }

            }


        }

        return result;
        
    }
}
