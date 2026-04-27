class Solution {
    Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(!seen.add(n)) return false;
        int[] numbers = digits(n);
        int sum=0;
        for(int num : numbers){
            sum+=num*num;
        }
        return isHappy(sum);
    }

    public int[] digits(int k){
        String s = String.valueOf(k);
        int[] result = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            result[i] = Integer.valueOf(s.charAt(i)-'0');
        }
        return result;
    }
}
