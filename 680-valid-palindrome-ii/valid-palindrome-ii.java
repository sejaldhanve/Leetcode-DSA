class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) !=s.charAt(right)){
                return isPal(left+1, right, s) || isPal(left, right-1, s);
            }
            left++;
            right--;
        }
        return true;
        
    }
    private boolean isPal(int left, int right, String s){
        while(left<right){
            if(s.charAt(left) !=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}