class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       Map<Integer, String> map = new HashMap<>();
       for(int i = 0; i < names.length; i ++) {
           map.put(heights[i], names[i]);
       }
       Arrays.sort(heights);

       String[] results = new String[heights.length];
       int index = 0;
       for(int i = names.length - 1; i >= 0; i --) {
           results[index] = map.get(heights[i]);
           index ++;
       } 
       return results;
    }
}
