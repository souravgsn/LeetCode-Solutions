
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        
        if(nums.length == 0){
            return list;
        }
        
        if(nums.length == 1){
             list.add(String.valueOf(nums[0]));
            return list;
        }
        for (int i = 0; i < nums.length-1; i++) {
            int count = 0;
            int temp = nums[i];
            while(i+1<nums.length && nums[i+1] == nums[i]+1  ){
                count++;
                i++;
            }


            
            if(count == 0){
                StringBuilder str = new StringBuilder();
                str.append(nums[i]);
                list.add(str.toString());
            }
            else{
                StringBuilder str = new StringBuilder();
                str.append(temp);
                str.append("->");
                str.append(temp+count);
                list.add(str.toString());
            }
        }
            int size = nums.length-1;
        if(nums[size] != nums[size-1]+1){
            list.add(String.valueOf((nums[size])));
        }
        return list;
    }
}