class Solution {
    public int totalWaviness(int num1, int num2) {
        int wave=0;
        for(int i=num1;i<=num2;i++){
            String str=Integer.toString(i);
            for(int j=1;j<=str.length()-2;j++){
                if(str.charAt(j)>str.charAt(j-1) && str.charAt(j)>str.charAt(j+1)){
                    wave+=1;
                }
                if(str.charAt(j)<str.charAt(j-1) && str.charAt(j)<str.charAt(j+1)){
                    wave+=1;
                }
            }
        }
        return wave;
        
        
    }
}