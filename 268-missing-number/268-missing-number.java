class Solution {
    public int missingNumber(int[] nums) {
        int sum1 =0;
        int sum2 = 0;
        int n= nums.length;
        
        sum1 = (n *(n+1))/2; 
        
        for(int i=0; i<nums.length ; i++){
            sum2 = sum2+ nums[i];
        }
        return sum1-sum2;
    }
}