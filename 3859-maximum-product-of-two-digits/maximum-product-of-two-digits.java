class Solution {
    public int maxProduct(int n) {
        List<Integer> list=new ArrayList<>();
        int product=0;
        int maxi=0;
        while(n!=0){
            int rem=n%10;
            list.add(rem);
            n=n/10;
        }

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                product=list.get(i)*list.get(j);
                maxi=Math.max(maxi, product);
            }
        }

        return maxi;
        
    }
}