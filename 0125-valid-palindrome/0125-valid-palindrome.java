class Solution {
    public boolean isPalindrome(String s) {
        
        String reversedWord;
        StringBuilder s1;
        
        if(s == null){
            return false;
        }
        
        else{
          
            if(s.isEmpty()){
            
            return true;
        }else{
            
            s = s.toLowerCase();
            s = s.replaceAll("[^a-zA-Z0-9]","");
            
             s1 = new StringBuilder(s);
            reversedWord = s1.reverse().toString();
               
            
        }
            
        }
        
        
        
        return s.equals(reversedWord);
        
    }
}