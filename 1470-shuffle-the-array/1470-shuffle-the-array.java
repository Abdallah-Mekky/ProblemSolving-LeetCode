class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int [] shuffle = new int[nums.length];
        
        //fill x
        int countX = 0;
        
        for(int i =0;i<nums.length;i +=2){
            
           shuffle[i] = nums[countX];
            countX++;
        }
        
        //fill y
        int countY = n;
        
        for(int i =1;i<nums.length; i += 2){
            
           shuffle[i] = nums[countY];
            countY++;
        }
        
        
        
        
        
        
        /*for(int i=1;i<nums.length ;i++){
            
            int temp = nums[i +1];
            
            nums[i +1] = nums[i];
            
            nums[i + 2] = temp;
        }*/
        
        return shuffle;
    }
}