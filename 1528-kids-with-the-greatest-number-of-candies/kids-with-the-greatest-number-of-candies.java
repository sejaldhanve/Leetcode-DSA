class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest=0;
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>greatest){
                greatest=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if(sum>=greatest){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

    return list;   
    }
}