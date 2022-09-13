class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(len == 0) return new int[] {0};
        
        for(int i = len-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i] = digits[i]+1;
                return digits;
            }else{
                digits[i] = 0;
            }
            
        }
        digits = new int[len+1];
        digits[0] = 1;
        return digits;
    }
}