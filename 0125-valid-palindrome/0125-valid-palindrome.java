class Solution {
    public boolean isPalindrome(String s) {
        
        String reversedWord;
        StringBuilder s1;
        
        if(s == null){
            return false;
        }
        
        if(s.length() == 0){
            
            return true;}
        
         
             s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
             s1 = new StringBuilder(s);
             reversedWord = s1.reverse().toString();   
       
        
        return s.equals(reversedWord);
        
    }
}