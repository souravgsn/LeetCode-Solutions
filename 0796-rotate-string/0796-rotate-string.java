class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        String res = s+s;
        return res.contains(goal);
    }
}