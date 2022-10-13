class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(!stack.empty() && (stack.peek() == s.charAt(i))){
                  stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(String.valueOf(stack.pop()));
        }
        return sb.reverse().toString();
    }
}