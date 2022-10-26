class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
		
		//Creating the frequency map i.e. keeping track of occurrence of each element
		
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
		
		//Checking for the occurrences of even no.s and checking which of the even no. in the array has occurred the most
		
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                if(map.get(nums[i]) > max){
                    max = map.get(nums[i]);
                }
            }
            
        }
        
		// Checking for the number that has occured maximum no. of times and which is also an even no.
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0 && map.get(nums[i]) == max){
                return nums[i];
            }
        }
        return -1;
    }
}