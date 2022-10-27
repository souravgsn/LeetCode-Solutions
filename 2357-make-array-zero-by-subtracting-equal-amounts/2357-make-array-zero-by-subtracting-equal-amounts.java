import java.util.*;
class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if(x != 0){
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] - x >= 0){
                    nums[j] = nums[j] - x;
                }
            }
            count++;
            }
        }
        return count;
    }
}