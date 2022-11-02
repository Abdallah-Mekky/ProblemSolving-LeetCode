class Solution {
    public boolean isPalindrome(String s) {
        
        String reversedWord;
        StringBuilder s1;
        
        if(s == null){
            return false;
        }
        
        else{
          
            if(s.length() == 0){
            
            return true;
        }else{
            
            s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");;
            reversedWord = new StringBuilder(s).reverse().toString();   
        }  
        }
        
        return s.equals(reversedWord);
       
    }
}