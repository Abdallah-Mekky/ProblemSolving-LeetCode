class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] myIndices = new int[2];
        
       // int counter = 0;
        
        for(int i = 0;i<nums.length -1 ;i++){
            
          // int counter = i; 
            for(int j = i+1;j < nums.length ;j++){
                
                
                /* if(nums[i] == target){
              
                myIndices[0] = i;
                   //  break;
                //return myIndices;
               }*/
                
               /* else if( (nums[i]+nums[i+1]) == target   ){
                
                myIndices[0] = i;
                myIndices[1] = counter++;
                    break;
               // return myIndices;
            }*/
                 if((nums[i] + nums[j]) == target){
                    
                  myIndices[0] = i;
                  myIndices[1] = j;  
                   // break;
                }
                
             //counter = 0;   
            }
        }
        
        return myIndices;
    }
}