    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            String[] ans = new String[names.length];
            for (int i = 0; i < heights.length; i++) {
                int max = i;
                for (int j = 0; j < heights.length; j++) {
                    if(heights[j] > heights[max]){
                        max = j;
                    }
                }
                heights[max] =0;
                ans[i] = names[max];
            }
            return ans;
        }
    }