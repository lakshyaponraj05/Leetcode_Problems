class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r=0,d=x;
        while(x>0){
            int l=x%10;
            r=r*10+l;
            x/=10;
        }
        if(d==r) return true;
        else return false;
    }
}