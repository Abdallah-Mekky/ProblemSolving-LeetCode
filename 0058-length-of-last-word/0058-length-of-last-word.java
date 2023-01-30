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
                
                
                //To Handling all cases but not handle case string with one word 
                if(s.charAt(i - 1) == ' ' ){
                
                       break;   
                }
             
                //To Handling only one case string with one word
                else if(i == 1){
                   
                       sizeOfLastWord++;
            }
            }
        }
        
        return sizeOfLastWord;
    }
}