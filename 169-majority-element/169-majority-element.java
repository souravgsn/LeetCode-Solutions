class Solution {
   int majorityElement(int[] num) {
     //     Arrays.sort(nums);
     // return nums[nums.length/2];
       
    int majorityIndex = 0;
    for (int count = 1, i = 1; i < num.length; i++) {
        if(num[majorityIndex] == num[i]){
            count++;
        }
        else{
            count--;
        }
        
        if (count == 0) {
            majorityIndex = i;
            count = 1;
        }
    }
        
    return num[majorityIndex];
}
  
}