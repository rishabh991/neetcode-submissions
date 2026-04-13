class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] lists = new List[nums.length+1];

        for(int i=0; i<lists.length; i++){
            lists[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
          lists[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index=0;

        for(int i=lists.length-1; i>=0; i--){
            for(int j : lists[i]){
                result[index]=j;
                index++;
                if(index==k) return result;
            }
            System.out.println(index);
        }

        return result;

    }
}
