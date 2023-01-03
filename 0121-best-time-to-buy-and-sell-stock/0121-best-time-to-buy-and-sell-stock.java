class Solution {
    public int maxProfit(int[] prices) {
        int max= 0;
        int[] pre = new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            if(i==prices.length-1){
                pre[i]=prices[i];
                max=prices[i];
            }
            else{
                pre[i]=Math.max(max,prices[i]);
                max = Math.max(max,prices[i]);
            }

        }
        int res = 0;
        for(int i=0;i<prices.length;i++){
            if(Math.abs(prices[i]-pre[i])>=res) res=Math.abs(prices[i]-pre[i]);

        }
        return res;
    }
}