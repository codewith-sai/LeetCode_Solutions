class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,maxl=0,maxR=0,trapWater=0;
        while(l<r){
            if(height[l]<=height[r]){
                maxl=Math.max(maxl,height[l]);
                trapWater+=maxl-height[l];
                l++;
            }else{
                maxR=Math.max(maxR,height[r]);
                trapWater+=maxR-height[r];
                r--;
            }
        }
        return trapWater;
    }
}