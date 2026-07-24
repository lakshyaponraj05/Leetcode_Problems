class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(int j=0;j<magazine.length();j++){
            freq[magazine.charAt(j)-'a']++;
            }
        
        for (int i=0; i<ransomNote.length();i++) {
            freq[ransomNote.charAt(i) - 'a']--;
            if (freq[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
        
        
    }
}