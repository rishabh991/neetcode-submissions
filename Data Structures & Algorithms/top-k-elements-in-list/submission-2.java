class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        //freq map
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        //array of list of frequencies
        List<Integer>[] lists = new List[nums.length+1];    //+1 for the case where all elements are same - that freq will need nth freq population
        
        for(int i=0; i<lists.length; i++){
            lists[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            lists[entry.getValue()].add(entry.getKey());
            //adding all elements with the same freq at one place
        }

        int[] res = new int[k];
        int ind = 0;

        for(int j=lists.length-1; j>=0; j--){
            for(int r : lists[j]){
                res[ind++] = r;
                if(ind==k) return res;
            }
        }
        return res;
    }
}
