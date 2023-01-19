class Solution {
    public int removeDuplicates(int[] nums) {
 int num = nums[0];
        int c = 1;
        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=num){
                num = nums[i];
                c++;
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i]=temp;
                index++;
            }
        }
        return c;
    }
}