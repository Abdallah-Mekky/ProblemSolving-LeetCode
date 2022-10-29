class Solution {
    public int[] decode(int[] encoded, int first) {
        
        int [] decodedArray = new int[encoded.length+1];
        
        decodedArray[0] = first;
        
        for(int i =0;i<encoded.length;i++){
           
            decodedArray[i+1] =  decodedArray[i] ^ encoded[i] ;
        }
        
        return decodedArray;
    }
}