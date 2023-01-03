class Solution {
    public int maxSubArray(int[] nums) {
        int gs = Integer.MIN_VALUE;
        int ssf= 0;
        for(int i=0;i<nums.length;i++){
            ssf+=nums[i];
            if(nums[i]>=ssf) ssf=nums[i];
            if(gs<ssf) gs=ssf;
        }
        return gs;
    }
    }
