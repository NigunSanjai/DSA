class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:nums){
            if(i>0) {
                if(nums[i-1]>0)nums[i-1] = 0 - nums[i-1];
            }
            else {
                if((nums[Math.abs(i)-1])>0) nums[Math.abs(i)-1] = 0-nums[Math.abs(i)-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)arr.add(i+1);
        }
        return arr;

    }
}