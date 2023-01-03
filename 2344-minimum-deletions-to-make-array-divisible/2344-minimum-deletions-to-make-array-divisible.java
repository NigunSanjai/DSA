class Solution {
    public int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int minOperations(int[] nums, int[] d) {
        int c = 0;
        //int g = 0;
        int result = d[0];
        for(int i=1;i<d.length;i++)
        {
            result = gcd(result, d[i]);
        }
       // System.out.println(result);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            if(result % nums[i] != 0)
                c++;
            else 
                return c;
        }
        return -1;
    }
}