class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        int maxc=c;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                c--;
            }
            if(isVowel(s.charAt(i))){
                c++;
            }
            maxc = Math.max(maxc, c);
        }
        return maxc;
    }
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }
        return false;
        
    }
}