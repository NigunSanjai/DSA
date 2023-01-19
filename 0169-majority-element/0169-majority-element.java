class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int num = 0;
        for(int i : nums){
            if(i!=num && c==0){
                num=i;
                c=1;
            }
            if(i==num) c++;
            else if(i!=num){
                c--;
                if(c==0){
                num=i;
                c=1;
                }
            }
     
        }
        return num;
    }
}