class Solution {
  public int countNegatives(int[][] grid) {
        int count = 0;
        
        for (int[] row : grid) {
            for (int i = row.length-1; i>-1; i--) {
                if(row[i]<0){
                    count++;
                }
                else{
                    break;
                }
            }
        }

        return count;
    }
}