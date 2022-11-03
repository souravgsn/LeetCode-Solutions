
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rmat = new int[row];
        int[] cmat = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if(matrix[i][j] == 0){
                    rmat[i] = -1;
                    cmat[j] = -1;
                }
                
            }
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if((cmat[j] == -1) || rmat[i] == -1){
                    matrix[i][j] = 0;
                }
                
            }
            
        }
    }
}