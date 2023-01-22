class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] targetArray = new int[nums.length];
        
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        
         for(int i = 0;i<index.length;i++){
             
             tempArray.add(index[i],nums[i]);
         }
        
        for(int i = 0;i<nums.length;i++){
            
            targetArray[i] = tempArray.get(i);
        }
        
       
        
        
//         for(int i = 0;i<targetArray.length;i++){
            
//           if( targetArray[index[i]] > 0){
              
//               for(int j = i;j<targetArray.length;j++){
                  
//                   int temp =  targetArray[index[i]];
//               targetArray[index[i]] = nums[i];
//               targetArray[index[i] + 1] = temp;}
//               }
              
//             else{
//               targetArray[index[i]] = nums[i];
//           }  
              
//           }
          return targetArray;  
    }    
        }
        
        
    
    
    
