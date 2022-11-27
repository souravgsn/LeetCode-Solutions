class Solution {
    public int maxPower(String s) {
        int max = 1;
        int temp = 1;
        for (int i=1; i<s.length(); i++){
            
            if (s.charAt(i-1) == s.charAt(i))
            temp++;
            else
            temp = 1;
            
            if (temp > max)
            max = temp;
        }
        
        return max;
    }
}