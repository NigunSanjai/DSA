class Solution {
        public int[] sortedSquares(int[] num) {
int l=0;
        int r = num.length-1;
        int index = num.length-1;
        int[] res = new int[num.length];
        for(int i=0;i<num.length;i++){
            if(Math.abs(num[l])<Math.abs(num[r])){
                res[index] = num[r]*num[r];
                r--;
            }
            else{
                res[index] = num[l]*num[l];
                l++;
            }
            index--;
        }
        return res;

        }
        
}