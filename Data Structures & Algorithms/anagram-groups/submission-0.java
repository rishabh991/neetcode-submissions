class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String, List<String>> result = new HashMap<>();

       for(String s : strs) {
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String key = new String(c);

        result.putIfAbsent(key, new ArrayList<>());
        result.get(key).add(s);
       }

       return new ArrayList<>(result.values());

    }
}
