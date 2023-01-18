class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        boolean f= true;
        for(int i = 0 ; i <nums.length ; i++){
            if(target-nums[i]==0) return i;
            else if(target-nums[i]<0 && f){
                index = i;
                f=false;
            } 
        }
        if(f) return nums.length;
        return index;
        }

    }