class Solution {
    public int[] buildArray(int[] nums) {
        
        int [] myNewArray = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            
            myNewArray[i] = nums[nums[i]];
        }
        
        return myNewArray;
    }
}