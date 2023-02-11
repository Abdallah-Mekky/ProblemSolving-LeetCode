class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int sumOfJewelsInStones = 0;
        
//         for(int i = 0;i<jewels.length();i++){
            
//             char currentJewel = jewels.charAt(i);
            
//             for(int j = 0;j<stones.length();j++){
                
//                  char currentStone = stones.charAt(j);
                
//                 if(currentJewel == currentStone){
                    
//                     sumOfJewelsInStones++;
                    
//                 }
//             }
//         }
        
        for(int i = 0;i<stones.length();i++){
            
            if(jewels.indexOf(stones.charAt(i)) != -1){
              sumOfJewelsInStones++;  
            }      
        }
        
        return sumOfJewelsInStones;
        
    }
}