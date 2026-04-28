class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i=0; i<piles.length; i++){
            r=Math.max(r,piles[i]);
        }
        int speed=1;
        while(l<=r){
            speed = l+(r-l)/2;
            long totalHours = 0;
            for(int j=0; j<piles.length; j++){
            //  totalHours += (int)Math.ceil((double)piles[j]/speed);
                totalHours += (piles[j]+speed-1)/speed;
            }
            if(totalHours>h){
                l=speed+1;
            }else{
                r=speed-1;
            }
        }
        return l;
    }
}
