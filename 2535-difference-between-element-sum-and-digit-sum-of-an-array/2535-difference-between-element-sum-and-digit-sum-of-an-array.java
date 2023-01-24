class Solution {
    public int differenceOfSum(int[] nums) {
       
        int elementSum = 0;
        int digitSum = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            elementSum += nums[i];
        }
        
        
        for(int i = 0;i<nums.length;i++){
            
            if(nums[i] > 9){
                
                while(nums[i] != 0 ){
                    
                    int temp = nums[i] % 10;
                    digitSum += temp;
                    nums[i] = nums[i] / 10;
                    
                }     
        }else{
              digitSum += nums[i];  
            }
            
    }
        
        return Math.abs(elementSum - digitSum);
}
}