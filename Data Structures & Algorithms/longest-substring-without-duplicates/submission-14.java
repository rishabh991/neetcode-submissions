class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        char[] c = s.toCharArray();
        int maxCount = 0;
        int count = 0;
        int prevInd = 0;
        
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<c.length; i++){  
            
            if(map.get(c[i])!=null){
                maxCount=Math.max(maxCount,count); //counts chars before this    
                prevInd=Math.max(prevInd,map.get(c[i]));
                count=i-(prevInd+1);
                System.out.println(count);
            }      
            map.put(c[i],i);
            count++;
        }

        if(maxCount<count) maxCount=count;
        return maxCount;
    }
}
