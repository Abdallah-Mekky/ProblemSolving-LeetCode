class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int counter = 0;
        
        if(ruleKey.equals("type")){
                
            for(int i = 0 ;i<items.size();i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    
                    counter++;
                }}
        
        }else if(ruleKey.equals("color")){
                
                 for(int i = 0 ;i<items.size();i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    
                    counter++;
                }}
        }else if(ruleKey.equals("name")){
                
                for(int i = 0 ;i<items.size();i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    
                    counter++;
                }}
            }
        
        
//         for(int i = 0 ;i<items.size();i++){
            
//             if(ruleKey.equals("type")){
                
//                 if(items.get(i).get(0).equals(ruleValue)){
                    
//                     counter++;
//                 }
                
//             }else if(ruleKey.equals("color")){
                
//                 if(items.get(i).get(1).equals(ruleValue)){
                    
//                     counter++;
//                 }
                
//             }else if(ruleKey.equals("name")){
                
//                 if(items.get(i).get(2) == ruleValue){
                    
//                     counter++;
//                 }
//             }
//         }
        
        return counter;
    }
}