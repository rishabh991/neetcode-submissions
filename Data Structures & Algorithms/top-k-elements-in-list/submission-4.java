class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int j=0; j<buckets.length; j++){
            buckets[j] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index=0;

        for(int p=buckets.length-1; p>=0; p--){
            for(int num : buckets[p]){
                result[index++]=num;
                if(index==k) return result;
            }
        }
        return result; 
    }
}
