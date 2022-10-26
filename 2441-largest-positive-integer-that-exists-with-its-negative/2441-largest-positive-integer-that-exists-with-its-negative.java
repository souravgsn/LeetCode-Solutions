class Solution {
    public int findMaxK(int[] nums) {
        int k = -1;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ;i<nums.length ;i++){
            int n = nums[i];
            set.add(n);
            
            if(set.contains(n*(-1))){
                 k = Math.max(k,Math.abs(n));            
            }
        }
        return k;
    }
}