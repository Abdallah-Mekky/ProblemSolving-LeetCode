class Solution {
    public boolean isAnagram(String s, String t) {
        
        //boolean isVaild = false;
        
        if(s == null || t == null || (s.length() != t.length()) ){
            
            return false;
        }
        
        if(s.length() == 0 && t.length() == 0){
            
           // isVaild = true;
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