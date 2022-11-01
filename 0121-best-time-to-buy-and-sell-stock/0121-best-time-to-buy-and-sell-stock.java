class Solution {
    public int maxProfit(int[] prices) {
        
        int priceOfBuy = Integer.MAX_VALUE;
        int tempProfit = 0;
        int maxProfit =0;
       
        
        //O(n^2)
      /*  for(int i=0;i<prices.length;i++){
            
            for(int j = i+1;j<prices.length;j++){
                
                temp = prices[j] - prices[i];
                
                if(temp > maxProfit){
                    
                    maxProfit = temp;
                }
            }
            
        }
        */
        
        for(int i =0;i<prices.length;i++){
            
            if(priceOfBuy > prices[i]){
                
                priceOfBuy = prices[i];
            }
            
            tempProfit = prices[i] - priceOfBuy;
            
            if(tempProfit > maxProfit){
                
                maxProfit = tempProfit;
            }
            
            
        }
        
        return maxProfit;
    }
}