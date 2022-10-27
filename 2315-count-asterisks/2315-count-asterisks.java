import java.util.Stack;

class Solution {
    public int countAsterisks(String s) {
        Stack<Character> st = new Stack<>();
        int count =0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if(start == 0 && s.charAt(i) == '*'){
                count++;
            }
            if(s.charAt(i) == '|' && start ==0){
                start = 1;
            }
            else if(start == 1 && s.charAt(i) =='|'){
                start =0;
            }

        }
        return count;        
    }
}