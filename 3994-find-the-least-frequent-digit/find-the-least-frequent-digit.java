class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];
        int minFreq=Integer.MAX_VALUE;
        int mini=Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<>();

        while(n!=0){
            int dig=n%10;
            freq[dig]++;
            n=n/10;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                minFreq=Math.min(freq[i], minFreq);
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==minFreq){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            mini=Math.min(mini, list.get(i));
        }

        return mini;
        
    }
}