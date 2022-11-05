
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] res) {
        
        int count = 1;
        int rowBegin = 0;
        int rowEnd = res.length - 1;
        int colBegin = 0;
        int colEnd = res[0].length - 1;
        List<Integer> ls  = new ArrayList<>();
        while(count <= res.length * res[0].length) {
                int i = rowBegin;
                int j = colBegin;
                //left to right
                for(j = colBegin ; j <= colEnd; j++){
                    ls.add(res[rowBegin][j]);
                    count++; 
                }
                rowBegin++;
                //top to bot
                for(i = rowBegin ; i <= rowEnd; i++){
                    ls.add(res[i][colEnd]); 
                    count++;
                }
                colEnd--;
                //right to left
                for(j = colEnd ; j >= colBegin; j--){
                    ls.add(res[rowEnd][j]); 
                    count++;
                }
                rowEnd--;
                //bot to top
                for(i = rowEnd; i >= rowBegin; i--){
                    ls.add(res[i][colBegin]) ;
                    count++;
                }
                colBegin++;
        }
        return ls.subList(0,res.length * res[0].length );
    }
}