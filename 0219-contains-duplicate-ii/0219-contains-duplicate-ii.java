class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0){
            return false;
        }
        for(int i = 0; i < nums.length-1 ; i++){
            int count = 0;
            
            for(int j=i+1 ; j < nums.length ; j++){
                  count++;
                if(nums[i] == nums[j]) {
                    return true;
                }
              
                if(count>=k) break;
            }
        }
        return false;
    }
}