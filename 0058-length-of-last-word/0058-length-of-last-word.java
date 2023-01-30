class Solution {
    public int lengthOfLastWord(String s) {
        
      int sizeOfLastWord = 0;
        
        s= s.trim();
        
        if(s.length() == 1){
        
            return 1;
        }
        
        
        for(int i = s.length()-1;i>0;i--){
            
            
            
            if(s.charAt(i) != ' '){
             sizeOfLastWord++;
             
             if(i == 1 && s.charAt(0) != ' '){
                   
                       sizeOfLastWord++;
                   }else if(s.charAt(i - 1) == ' ' ){
                
                   //else{
                   
                       break;
                   //}
                    
                }
            }
             
            
        }
        
        return sizeOfLastWord;
    }
}