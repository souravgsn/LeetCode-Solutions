class Solution {
public String makeGood(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(!stack.empty() && (Math.abs(stack.peek()-s.charAt(i)) == 32)){
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