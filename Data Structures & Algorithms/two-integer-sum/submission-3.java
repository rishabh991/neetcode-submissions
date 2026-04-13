class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0 || nums.length==1) return new int[] {};

        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i<nums.length; i++){       
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                Arrays.sort(res);
                return res;
            }           
            map.put(nums[i], i);
        }

        return new int[] {};

    }

}
