class Solution {
    public int binaryGap(int n) {
        int last = -1;      // position of last seen 1
        int maxDist = 0;    // maximum distance
        int position = 0;   // current bit position
        
        while (n > 0) {
            if ((n & 1) == 1) {      // check if last bit is 1
                if (last != -1) {
                    maxDist = Math.max(maxDist, position - last);
                }
                last = position;
            }
            
            n = n >> 1;   // right shift
            position++;
        }
        
        return maxDist;
        
    }
}