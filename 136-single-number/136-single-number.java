
class Solution {
 static public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                map.put(nums[i], 2);
                continue;
            }
             map.put(nums[i], 1);
            
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
 
             
        }
        return 0; 
    }
}