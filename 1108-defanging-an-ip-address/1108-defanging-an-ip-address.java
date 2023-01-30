class Solution {
    public String defangIPaddr(String address) {
       
//         String s = "";
        
//         for(int i = 0 ;i<address.length();i++){
            
//             if(address.charAt(i) == '.'){
                
//                 s += "[.]";
//             }else{
                
//                 s += address.charAt(i);
//             }
//         }
        
        StringBuilder s =new StringBuilder();
        for(int i = 0 ; i <address.length() ;i++ ){
            if(address.charAt(i)=='.') 
            {
                s.append("[.]");
            }
            else{
                s.append(address.charAt(i));
            }
        }
        return s.toString();
        
        
      //  return s;
    }
}