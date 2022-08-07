class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        char temp;
        int i =0;
        while(i<=n){
        temp = s[i];
        s[i] = s[n];
        s[n] = temp;
            ++i;
            --n;
        }
    }
   
}