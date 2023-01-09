class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean found = false;
        int[] arr = {-1, -1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(!found){
                    arr[0] = i;
                    arr[1] = i;
                    found = true;
                }
                else{
                    arr[1] = i;
                }
            }
        }
        return arr;
    }
}