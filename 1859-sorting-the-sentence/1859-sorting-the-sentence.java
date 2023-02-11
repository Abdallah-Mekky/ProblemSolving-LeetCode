class Solution {
    public String sortSentence(String s) {
     
        
        //divide the sentence into words with delimiter space
        String [] wordsOfSentence = s.split(" ");
        
        //contains the words in order
        String [] orderedSentence = new String[wordsOfSentence.length];
        
        //real index of each word in orderedSentence array
        int numOfWord = 0;
        
        for(int i = 0; i<wordsOfSentence.length; i++){
            
    //note : each word that represent string
    //get the index from each word 
    numOfWord = 
        Integer.valueOf(wordsOfSentence[i].substring(wordsOfSentence[i].length() - 1));
        
            
    orderedSentence[numOfWord - 1] =
        wordsOfSentence[i].substring(0,wordsOfSentence[i].length() - 1);    
        }
        
        return String.join(" ",orderedSentence);
    }
}