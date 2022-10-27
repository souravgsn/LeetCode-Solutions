import java.util.Stack;

class Solution {
    public int countAsterisks(String s) {
        Stack<Character> st = new Stack<>();
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty() && s.charAt(i) == '*'){
                count++;
            }
            if(st.isEmpty() && s.charAt(i) == '|'){
                st.push('|');
            }
            else if(!st.isEmpty() && s.charAt(i) == '|'){
                st.pop();
            }

        }
        return count;        
    }
}