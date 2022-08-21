class Solution {
    public String toLowerCase(String s) {
         StringBuilder ans = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char ch = (char)(s.charAt(i)+32);
                ans.insert(i, ch);
            }
            else{
                ans.insert(i, s.charAt(i));
            }
        }
        return ans.toString();
    }
}