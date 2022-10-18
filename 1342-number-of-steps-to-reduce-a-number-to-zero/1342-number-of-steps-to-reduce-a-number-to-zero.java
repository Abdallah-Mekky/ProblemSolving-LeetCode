class Solution {
    public int numberOfSteps(int num) {
        
        int counterOfSteps = 0;
        
        while(num != 0){
               if(num % 2 == 0){
                
                num /= 2;
                counterOfSteps++;
            }
            else if(num % 2 == 1){
                
                num -= 1;
                counterOfSteps++;
            }
            
        }
           
        return counterOfSteps;
    }
}