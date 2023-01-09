class Solution {
    public void sortColors(int[] a) {
                int l = 0,m=0,k=a.length-1;
        while(m<=k){
            if(a[m]==0){
                int temp=a[l];
                a[l] = a[m];
                a[m] = temp;
                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int temp=a[m];
                a[m] = a[k];
                a[k] = temp;
                k--;
            }
        }
    }
}