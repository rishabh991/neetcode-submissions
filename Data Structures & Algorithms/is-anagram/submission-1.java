class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        String ss = new String(sc);
        String ts = new String(tc);
        
        System.out.println(ss);
        System.out.println(ts);

        if(ss.equals(ts)) return true;

        return false;

    }
}
