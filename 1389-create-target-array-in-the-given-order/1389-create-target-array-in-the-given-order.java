class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        
         for(int i = 0;i<index.length;i++){
             
             tempArray.add(index[i],nums[i]);
         }
        
        for(int i = 0;i<nums.length;i++){
            
            nums[i] = tempArray.get(i);
        }
  
          return nums;  
    }    
        }
        
        
    
    
    
