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
        
        return shuffle;
    }
}