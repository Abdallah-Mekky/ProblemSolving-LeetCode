class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maximumNumberOfWords = 0;
        
        for(int i =0;i<sentences.length;i++){
            
            if(sentences[i].split(" ").length > maximumNumberOfWords){
                
               maximumNumberOfWords =  sentences[i].split(" ").length;
            }
        }
        
        return maximumNumberOfWords;
    }
}