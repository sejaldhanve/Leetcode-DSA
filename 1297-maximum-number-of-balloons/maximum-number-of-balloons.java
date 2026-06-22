class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
        }

        int b=map.getOrDefault('b', 0);
        int a=map.getOrDefault('a', 0);
        int l=map.getOrDefault('l', 0)/2;
        int o=map.getOrDefault('o', 0)/2;
        int n=map.getOrDefault('n', 0);

        int ans=Math.min(b, a);
        ans=Math.min(ans, l);
        ans=Math.min(ans, o);
        ans=Math.min(ans, n);

        return ans;
        
    }
}