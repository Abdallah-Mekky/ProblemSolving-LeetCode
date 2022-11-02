class Solution {
    public boolean isPalindrome(String s) {
        
       /* String reversedWord;
        StringBuilder s1;
        
        if(s == null){
            return false;
        }
        
        else{
          
            if(s.length() == 0){
            
            return true;
        }else{
            
            s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");;
            
             s1 = new StringBuilder(s);
            reversedWord = s1.reverse().toString();   
        }
            
        }
        
        
        
        return s.equals(reversedWord);*/
        
         s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}