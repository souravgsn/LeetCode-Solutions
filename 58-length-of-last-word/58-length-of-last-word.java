class Solution {
    public int lengthOfLastWord(String s) {
        var len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            
            if(s.charAt(i) == ' ') {
              if(len > 0){
                  break;
              }
            }
            else if(s.charAt(i) != ' '){
            len++;
            }
        }
        return len;
    }
}