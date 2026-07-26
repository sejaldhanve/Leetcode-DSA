class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        int maxArea=Integer.MIN_VALUE;

        while(l<r){
            int mini=Math.min(height[l], height[r]);
            area=mini*(r-l);
            maxArea=Math.max(maxArea, area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxArea;

    }
}