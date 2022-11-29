class Solution {
    public boolean checkString(String s) {
        boolean temp = false,bool = false;
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
               temp = true;
            }
            
            if(s.charAt(i) == 'a' && temp == true) return false;
            
        }
        return true;
    }
}