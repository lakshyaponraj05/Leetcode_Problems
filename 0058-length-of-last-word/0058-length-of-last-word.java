class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                return a[i].length();
            }
        }
        return 0;
    }
}