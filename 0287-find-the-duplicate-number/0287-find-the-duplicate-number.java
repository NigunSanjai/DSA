class Solution {
    public int findDuplicate(int[] nums) {
       for(int i=0;i<nums.length;i++){
           if(nums[i]>0) {
               if (nums[Math.abs(nums[i])] < 0 && Math.abs(nums[i]) != nums.length) {
                   return (Math.abs(nums[i]));
//                  break;
               } else if (Math.abs(nums[i]) == nums.length && nums[Math.abs(nums[i] - 1)] < 0) {
                   return (Math.abs(nums[i] - 1));

               } else {
                   if (nums[i] != nums.length) nums[nums[i]] = 0 - nums[nums[i]];
                   else nums[nums[i] - 1] = 0 - nums[nums[i] - 1];
               }
           }
           else if(nums[i]<0){
               if(nums[Math.abs(nums[i])]<0 && Math.abs(nums[i])!=nums.length){
                  return (Math.abs(nums[i]));
//                  break;
               }
               else  if(Math.abs(nums[i])==nums.length && nums[Math.abs(nums[i]-1)]<0  ){
                   return (Math.abs(nums[i]-1));

               }
               else{
                   if(nums[i]!=nums.length) nums[Math.abs(nums[i])]=0-nums[Math.abs(nums[i])];
                   else nums[Math.abs(nums[i]-1)]=0-nums[Math.abs(nums[i]-1)];

               }
           }
       }
       return -1;
    }
}