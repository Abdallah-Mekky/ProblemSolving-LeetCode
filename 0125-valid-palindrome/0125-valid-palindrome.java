class Solution {
    public boolean isPalindrome(String s) {
        
        String reversedWord;
        
        if(s == null || s.length() == 0){
            
            return true;
        }else{
            
            s = s.toLowerCase();
            s = s.replaceAll("[^a-zA-Z0-9]","");
            
            StringBuilder s1 = new StringBuilder(s);
            reversedWord =  s1.reverse().toString();
            
        }
        
        return s.equals(reversedWord);
        
    }
}