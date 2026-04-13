class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str :strs){
            int[] count = new int[26];
            for(int i=0; i<str.length(); i++){
                count[str.charAt(i)-'a']++;
            }
            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}
