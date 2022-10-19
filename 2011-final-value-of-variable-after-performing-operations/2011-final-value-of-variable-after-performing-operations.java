class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int finalValue = 0;
        
        for(int i =0;i<operations.length;i++){
            
            if( (operations[i].contains("++X"))   || (operations[i].contains("X++")) ){
                
                finalValue += 1;
            }
            else if( (operations[i].contains("--X")) || (operations[i].contains("X--")) ){
                
                finalValue -=1;
            }
        }
        
        return finalValue;
    }
}