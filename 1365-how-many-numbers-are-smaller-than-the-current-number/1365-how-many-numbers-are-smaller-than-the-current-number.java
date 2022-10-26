class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int [] smallerNumbers = new int[nums.length];
        int counter = 0;
        
        for(int i =0;i<nums.length;i++){
            
            for(int j= 0;j<nums.length;j++){
                
                if(nums[j] < nums[i]){
                    
                    counter++;
                }
            }
            
            smallerNumbers[i] = counter;
            counter = 0;
            
        }
        
        return smallerNumbers;
    }
}