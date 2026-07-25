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
        int largest=0;
        int sec=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                sec=largest;
                largest=list.get(i);
            }
            else if(list.get(i)>sec){
                sec=list.get(i);
            }

        }

        return largest*sec;
        
    }
}