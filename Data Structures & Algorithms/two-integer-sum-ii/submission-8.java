class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i1=0;
        int i2=numbers.length-1;

        while(i1<i2 && i1<numbers.length && i2<numbers.length){
            if(numbers[i1]+numbers[i2]==target){
                return new int[] {i1+1,i2+1};
            }else if(numbers[i1]+numbers[i2]<target){
                i1++;
            }else{
                i2--;
            }
        }

        return new int[2];
    }
}
