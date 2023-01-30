class Solution {
    public String defangIPaddr(String address) {
       
        //Soultion 1
//         String s = "";
        
//         for(int i = 0 ;i<address.length();i++){
            
//             if(address.charAt(i) == '.'){
                
//                 s += "[.]";
//             }else{
                
//                 s += address.charAt(i);
//             }
//         }
        
        //Soultion 2
        //return address.replace(".","[.]");
        
        //Soultion 3
        StringBuilder IP =new StringBuilder();
        for(int i = 0 ; i <address.length();i++){
            
            if(address.charAt(i) == '.') 
            {
                IP.append("[.]");
            }
            else{
                IP.append(address.charAt(i));
            }
        }
        return IP.toString();
        
        

    }
}