class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1c = new int[26];

        for(int i=0; i<s1.length(); i++){
            s1c[s1.charAt(i)-'a']++;
        }

        int[] s1cc = s1c.clone();

        for(int j=0; j<=s2.length()-s1.length(); j++){
            int k=0;
            while(k < s1.length()){
                s1cc[s2.charAt(j+k)-'a']--;
                k++;
            }
            if(IntStream.of(s1cc).allMatch(x -> x == 0)) return true;
            k=0;
            s1cc = s1c.clone();
        }    

        return false;
    
    }
}
