class Solution {
    public boolean isAnagram(String s, String t) {
        
       
        
        if(s == null || t == null){
        
            return false;
        }
        
        if(s.length() != t.length()){
            
            return false;
        }
        
        String sort1 = sortString(s);
        String sort2 = sortString(t);
         
        return sort1.equals(sort2);
    }
    
    public String sortString(String s){
            
            char [] myChars = s.toCharArray();
            
            Arrays.sort(myChars);
            
            return new String(myChars);
        }
        
}