class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int buyprice=prices[0];
        for(int i=0;i<n;i++){
            if(buyprice>prices[i]){
                buyprice=prices[i];
            }else{
                int curr=prices[i]-buyprice;
                max=Math.max(curr,max);
            }

        }
        return max;
    }
}