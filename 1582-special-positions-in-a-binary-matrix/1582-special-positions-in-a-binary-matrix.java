class Solution {
    public int numSpecial(int[][] mat) {
     int count =0;
        int ci ;
        for (int i = 0; i < mat.length; i++) {
             ci=0;
            int jdx =0;
            int idx =0;    
            int cj =0;
            for (int j = 0; j < mat[0].length; j++) {   //return 1 in each row
                if(mat[i][j] == 1){
                    ci++;
                    idx = j;
                }
                if(ci>1){
                    break;
                }
            }
            
                for (int j = 0; j < mat.length ; j++) { //return 1 from each column
                    if(mat[j][idx] == 1){
                        cj++;
                        jdx = j;
                    }
                    if(cj>1){
                        break;
                    }
                }

            if(ci == 1 && cj ==1 ){
                count++;
            }

        }
        return count;
    }
}