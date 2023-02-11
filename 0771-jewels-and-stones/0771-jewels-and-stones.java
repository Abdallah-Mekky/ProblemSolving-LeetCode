class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int sumOfJewelsInStones = 0;
        
        for(int i = 0;i<jewels.length();i++){
            
           // char currentJewel = ;
            
            for(int j = 0;j<stones.length();j++){
                
                // char currentStone = ;
                
                if(jewels.charAt(i) == stones.charAt(j)){
                    
                    sumOfJewelsInStones++;
                    
                }
            }
        }
        
        return sumOfJewelsInStones;
        
    }
}