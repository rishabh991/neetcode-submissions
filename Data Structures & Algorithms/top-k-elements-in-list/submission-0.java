class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<int[]> fl = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            fl.add(new int[] {entry.getValue(), entry.getKey()});
            fl.sort((a,b) -> Integer.compare(b[0],a[0]));
        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i]=fl.get(i)[1];
        }

        return result;
    }
}
