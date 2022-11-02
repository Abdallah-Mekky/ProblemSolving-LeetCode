class Solution {
    public boolean isAnagram(String s, String t) {
        
       
        
        if(s == null || t == null){
        
            return false;
        }
        
        if(s.length() != t.length()){
            
            return false;
        }
        
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        
        s = sortString(s);
        t = sortString(t);
         
        return s.equals(t);
    }
    
    public String sortString(String s){
            
            char [] myChars = s.toCharArray();
            
            Arrays.sort(myChars);
            
            return new String(myChars);
        }
        
}