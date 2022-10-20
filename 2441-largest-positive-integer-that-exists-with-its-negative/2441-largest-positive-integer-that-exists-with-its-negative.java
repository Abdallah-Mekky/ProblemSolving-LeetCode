class Solution {
    public int findMaxK(int[] nums) {
        
        int maxNumber = Integer.MIN_VALUE;
        ArrayList<Integer> myMaxNumbers = new ArrayList<Integer>();
        int finalMax = Integer.MIN_VALUE;
       // int [] myMax = new int[nums.length];
        
        
        for(int i =0;i<nums.length;i++){
            
           /* if(nums[i] > maxNumber){
                maxNumber = nums[i];
            }*/
           
            for(int j=0;j<nums.length;j++){
                
                if( nums[j] == (-1 * nums[i]) && nums[j] > maxNumber ){
                    
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