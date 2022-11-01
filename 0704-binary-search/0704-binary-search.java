class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            
            int middle = (start+end)/2;
                
                if(target == nums[middle]){
                    
                    return middle;
                }
            else if(target > nums[middle]){
                
                start = middle +1;
            }
            else{
                
                end = middle -1;
            }
        }
        
        return -1;
    }
}