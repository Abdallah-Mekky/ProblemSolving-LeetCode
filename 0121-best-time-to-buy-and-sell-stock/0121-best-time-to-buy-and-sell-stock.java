class Solution {
    public int maxProfit(int[] prices) {
        
        int priceOfBuy = Integer.MAX_VALUE;
       // int dayOfBuy = 0;
        int tempProfit = 0;
        int maxProfit =0;
       // int temp = 0;
        
        
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
               // dayOfBuy = i;
                
            }
            
            tempProfit = prices[i] - priceOfBuy;
            
            if(tempProfit > maxProfit){
                
                maxProfit = tempProfit;
            }
            
            
        }
        
       /* for(int i = dayOfBuy +1 ;i<prices.length;i++){
            
            if(priceOfSell < prices[i]){
                
                priceOfSell = prices[i];
            }
        }
        
       if(priceOfSell > 0 && priceOfBuy > 0){
            
            maxProfit = priceOfSell - priceOfBuy;
        }else{
            
            return 0;
        }*/
        
        
        return maxProfit;
    }
}