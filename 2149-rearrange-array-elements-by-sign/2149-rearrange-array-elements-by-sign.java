import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        Queue<Integer> pve = new LinkedList<>();
        Queue<Integer> nve = new LinkedList<>();

        for (int num : nums) {
            if(num > 0){
                pve.add(num);
            }else{
                nve.add(num);
            }
        }

        for(int i=0 ;i< nums.length ;i++){
            if( i%2 == 0){
                nums[i] = pve.remove();
            }else{
                nums[i] = nve.remove();
            }

        }
        return nums;
    }
}