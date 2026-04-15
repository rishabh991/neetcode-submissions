class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        int max=0;
        int count=0;

        Map<Character, Integer> map = new HashMap<>();
        int l=0;

        for(int i=0 ; i<s.length(); i++){
            if(!map.isEmpty() && map.containsKey(s.charAt(i))){
                l=Math.max(map.get(s.charAt(i)),l);
                count=i-(l+1);
            }
            map.put(s.charAt(i),i);
            count++;
            max = Math.max(count,max);
        }
        return max;
    }
}
