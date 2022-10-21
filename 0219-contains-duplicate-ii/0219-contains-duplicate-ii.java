// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         if(k==0){
//             return false;
//         }
//         for(int i = 0; i < nums.length-1 ; i++){
//             int count = 0;
            
//             for(int j=i+1 ; j < nums.length ; j++){
//                   count++;
//                 if(nums[i] == nums[j]) {
//                     return true;
//                 }
              
//                 if(count>=k) break;
//             }
//         }
//         return false;
//     }
    
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
                return true;
            hashMap.put(integer, i);
        }
        return false;
    }
}