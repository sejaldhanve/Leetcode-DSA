class Solution {
    private int func(int[] stones, int index){
        if(index>=stones.length){
            return 0;
        }
        int curJump=stones[index]-stones[index-2];
        return Math.max(curJump, func(stones, index+1));
    }
    public int maxJump(int[] stones) {
        if(stones.length==2){
            return stones[1]-stones[0];
        }

        return Math.max(stones[1]-stones[0], func(stones, 2));
        
    }
}