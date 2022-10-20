class Solution {
    public int findMaxK(int[] nums) {
        
        int maxNumber = 0;
        ArrayList<Integer> myMaxNumbers = new ArrayList<Integer>();
        int finalMax = 0;
      
        
        for(int i =0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                
                if( nums[j] == (-nums[i]) && nums[j] > maxNumber ){
                    
                    maxNumber = nums[j];
                    myMaxNumbers.add(maxNumber);
                    
                }
            }
            
        }
         
        for(int i=0;i<myMaxNumbers.size();i++){
            
            if(myMaxNumbers.get(i) > finalMax ){
                
                finalMax = myMaxNumbers.get(i);
            }
        }
        
        if(finalMax > 0){
            
            return finalMax;
        }
        
        
        
       return -1;
        
        
    }
}