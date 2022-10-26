class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        
        for(int i =0;i<nums.length;i++){
            
           tempArray.add(nums[i]); 
        }
        
        Collections.sort(tempArray);        
        
        int [] smallerNumbers = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            smallerNumbers[i] = tempArray.indexOf(nums[i]);
        }
    
        return smallerNumbers;
    }
}