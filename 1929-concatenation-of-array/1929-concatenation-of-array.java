class Solution {
    public int[] getConcatenation(int[] nums) {
        
      int [] answer = new int[(2*nums.length)];
      int counter = 0 ;
        
        for(int i = 0 ;i<answer.length;i++){
            
            if( counter == nums.length  ){
                
                counter = 0;
            }
            
            answer[i] = nums[counter];
            counter++;
        }
        
        return answer;
    }
}