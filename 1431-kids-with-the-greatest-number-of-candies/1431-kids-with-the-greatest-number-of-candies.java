class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        
        List<Boolean> myList = new ArrayList<>();
        int maxNumber = Arrays.stream(candies).max().getAsInt();
        
        for(int i =0;i<candies.length;i++){
            
            if( (candies[i] + extraCandies) >=  maxNumber  ){
                
                myList.add(true);
            }
            else if( (candies[i] + extraCandies) <  maxNumber ){
                
                myList.add(false);
                
            }
        }
        
        return myList;
        
        
        
        
    }
}