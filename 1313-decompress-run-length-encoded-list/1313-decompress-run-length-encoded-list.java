class Solution {
    public int[] decompressRLElist(int[] nums) {
         int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        
        int[] arr = new int[arrSize];
        int k = 0;
        for(int i = 0 ;i<nums.length ; i++){
         for(int j=0;j<nums[i];j++){
             arr[k] = nums[i+1];
             k++;
         }
            i++;
     }
        return arr;
    }
}