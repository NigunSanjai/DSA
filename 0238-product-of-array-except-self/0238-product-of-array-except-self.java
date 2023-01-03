class Solution {
    public int[] productExceptSelf(int[] arr) {
        
                int pre = 1;
        int suf = 1;
        int res[] = new int[arr.length];
        res[0] = 1;
        int c = 1;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                pre *= arr[i];
                res[c] = pre;
                j--;
                c++;
            }
        }
        c = arr.length - 2;
        for (int i = arr.length - 1; i > 0; i--) {
                suf *= arr[i];
                res[c] *= suf;
                j--;
                c--;
            }



        return res;
        
    }
}