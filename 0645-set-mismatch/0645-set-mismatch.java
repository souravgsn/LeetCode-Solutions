class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = 0;
        int sum =0;
        for(int i =0 ;i < nums.length;i++){
            if(!set.add(nums[i])){
                n = nums[i];
            }else{
                
            set.add(nums[i]);
            sum+=nums[i];
        }
        }
        sum = sum-n;
        int n2 = nums.length;
        int sum2 = (n2*(n2+1)/2) - sum;
        
        int[] arr  = {n,sum2-n};
        return arr;
        
    }
}