class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
       
        boolean isVaild = true;
        
        for(int i = matrix.length -1;i > 0;i--){
            
            for(int j = matrix[0].length -1;j>0;j--){
                
                
                if(matrix[i][j] != matrix[i-1][j-1]){
                    
                    isVaild = false;
                    break;
                    
   /* if( (i== 0 && j == 0) || (i == matrix.length-1 && j == 0) ||   (i== 0 && j == matrix[0].length) ){
        
        continue;
    }*/
                }/*else{
                    
                    isVaild = true;
                }*/
                
            }
            
        }
        
        return isVaild;
    }
}