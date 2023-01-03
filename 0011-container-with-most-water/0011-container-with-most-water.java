class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int mh=0;
        while(i<j){
            int area=0;
            if(height[i]<height[j]){
                area=(j-i)*((height[j])-(height[j]-height[i]));
                if(area>mh) mh=area;
                i++;
            }
            else{
                area=(j-i)*((height[i])-(height[i]-height[j]));
                if(area>mh) mh=area;
                j--;
            }
        }
        return mh;
    }
}