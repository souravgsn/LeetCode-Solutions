class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i =0;
        int j =1;
        for(int n : nums){
            if(n > 0){
                ans[i] = n;
                i+=2;
            }
            if(n < 0){
                ans[j] =n;
                j+=2;
            }
        }
        
        return ans;
    }
}