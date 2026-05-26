class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> upper=new HashSet<>();
        Set<Character> lower=new HashSet<>();
        int count=0;
        for(int i=0;i<word.length();i++){
            char charac=word.charAt(i);
            if(Character.isUpperCase(charac)){
                upper.add(charac);
            }
            if(Character.isLowerCase(charac)){
                lower.add(charac);
            }
        }
        for(char i='a';i<='z';i++){
            if(lower.contains(i) && upper.contains(Character.toUpperCase(i))){
                count++;
            }
        }
    return count; 
    }
}