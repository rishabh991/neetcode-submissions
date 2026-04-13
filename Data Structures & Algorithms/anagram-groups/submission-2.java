class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for(String str : strs){
            for(int i=0; i<str.length(); i++){
                count[str.charAt(i)-'a']++;
            }
            
            String key = Arrays.toString(count);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>(Arrays.asList(str)));
            } else{
                map.get(key).add(str);
            }
            //use putIfAbsent or computeIfAbsent above
            count = new int[26];
        }

        List<List<String>> result = new ArrayList<>();

        /*for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }*/

        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}
