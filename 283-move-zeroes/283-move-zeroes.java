class Solution {
    static void moveZeroes(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                int k=i;
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=0){
                        swap(nums,k,j);
                        k++;
                    }
                }
            }
            
        }

    }

    static void swap(int[] nums , int a ,int b){
        int temp = nums[b];
        nums[b]=nums[a];
        nums[a]=temp;
  }
}