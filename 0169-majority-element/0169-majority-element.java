class Solution {
    public int majorityElement(int[] nums) {
             
        //O(n)
       /* int major= nums[0];
        int count = 1;
        
        for(int i=1;i<nums.length;i++){
            
            if(count == 0){
                
                count++;
                major = nums[i];
            }else if(major == nums[i]){
                 count++;
            }else{
                 count--;
            
            }
        }
        
        return major;*/
        
        
        Arrays.sort(nums);
        return nums[(nums.length -1)/2];
    }
}