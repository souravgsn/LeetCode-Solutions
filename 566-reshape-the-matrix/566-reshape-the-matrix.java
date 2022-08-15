class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int m,n ;
        m = 0;
        n = 0;
        
        if((mat.length* mat[0].length) != (r*c) ){
            return mat;
        }
        
        int[][] arr = new int[r][c] ;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(n==c){
                    n=0;
                    m++;
                }
                arr[m][n++]=mat[i][j];
            }
        }
        return arr;
        }
}