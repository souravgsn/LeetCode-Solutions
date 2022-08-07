class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        helper(s , 0 ,n);
    }
    public void helper(char[] s , int i , int n){
        if(i>=n){
            return;
        }
        char temp;
        temp = s[i];
        s[i] = s[n];
        s[n] = temp;
        helper(s , ++i,--n);
        
    }
}