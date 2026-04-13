class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            s.add(num);
        }

        for(int n : s){
            if(!s.contains(n-1)){
                int len=1;
                while(s.contains(n+len)){
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }

        return longest;
    }
}
