class Solution {
    public int removeDuplicates(int[] nums) {
        
       int number = 1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i] != nums[i-1]){
                
                nums[number] = nums[i];
                number++;
            }
        }
        
return number;
        }
        
    }
