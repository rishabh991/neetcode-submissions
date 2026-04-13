class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length-2; i++){ //Taking -2 because that's the last index after which two elements will remain - as required for a triplet

            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;

            int l=i+1;
            int r=nums.length-1;

            int sum;

            while(l<r){

                sum = nums[i]+nums[l]+nums[r];

                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                    result.add(new ArrayList<Integer> (Arrays.asList(nums[i],nums[l],nums[r])));
             
                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(r>l && nums[r]==nums[r+1]){
                        r--;
                    }
                }
            }
        }         
        return result;
    }
}
