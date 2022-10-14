class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if((!st.empty()) && (s.charAt(i) == '#')){
                st.pop();
            }
            else{
                if(s.charAt(i) != '#'){
                    st.push(s.charAt(i));
                }
            }
        }
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if((!st2.empty()) && (t.charAt(i) == '#')){
                st2.pop();
            }
            else{
                if(t.charAt(i) != '#'){
                    st2.push(t.charAt(i));
                }
            }
        }
        return st.equals(st2);
    }
}