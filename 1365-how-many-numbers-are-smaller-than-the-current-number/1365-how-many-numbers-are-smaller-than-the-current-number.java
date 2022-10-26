class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    
        
       // O(n)
        
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
        
        
        //O(n^2)
       /* int [] smallerNumbers = new int[nums.length];
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
        
        return smallerNumbers;*/
    }
}