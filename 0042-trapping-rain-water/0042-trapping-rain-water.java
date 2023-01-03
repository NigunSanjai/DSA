class Solution {
    public int trap(int[] a) {
        int l=0,r=a.length-1;
        int lm=0, rm=0;
        int res = 0;
        while(l<=r){
           if(a[l]<=a[r]){
               if(a[l]>=lm) lm=a[l];
           else res+=lm-a[l];
           l++;
           }
           else{
               if(a[r]>=rm) rm=a[r];
               else res+=rm-a[r];
            r--;
           }
        }
        return res;
        
    }
}