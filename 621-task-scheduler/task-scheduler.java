class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxFreq=0;
        for(int freq:map.values()){
            maxFreq=Math.max(maxFreq, freq);

        }
        int count=0;
        for(int freq:map.values()){
            if(freq==maxFreq){
                count++;
            }
        }

        int ans=(maxFreq-1)*(n+1)+count;
        return Math.max(ans, tasks.length);

        
    }
}