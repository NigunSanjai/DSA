class Solution {
    public int climbStairs(int n) {
        int s =0;
        int s1 = 1;
        for(int i=1;i<=n;i++){
            int next = s+s1;
            s = s1;
            s1=next;
        }
        return s1;
    }
}