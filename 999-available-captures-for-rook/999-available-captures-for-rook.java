class Solution {
        public int numRookCaptures(char[][] board) {
            int p =0;
        boolean haveRook =false;
        
        int idx =0,jdx =0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]=='R'){
                    haveRook = true;
                    idx = i;
                    jdx =j;
                    break;
                }
                
            }
        }
        if(haveRook == true){
            
            for (int i = jdx+1 ; i < board.length; i++) {
                if(board[idx][i] == 'B'){
                    break;
                }
                if(board[idx][i]=='p'){
                    p++;
                    break;
                }
            }
            for (int i = jdx-1; i >-1; i--) {
                if(board[idx][i] == 'B'){
                    break;
                }
                if(board[idx][i]=='p'){
                    p++;
                    break;
                }                
            }
            for (int i = idx+1; i < board.length; i++) {
                if(board[i][jdx] == 'B'){
                    break;
                }
                if(board[i][jdx]=='p'){
                    p++;
                    break;
                }
            }
            for (int i = idx-1; i >-1; i--) {
                if(board[i][jdx] == 'B'){
                    break;
                }
                if(board[i][jdx]=='p'){
                    p++;
                    break;
                }
            }
        }
       return p; 
        }
}