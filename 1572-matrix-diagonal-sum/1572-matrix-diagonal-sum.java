class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
 for(int i=0,k=mat.length-1;i<mat.length;i++,k--)
 {
       sum=sum+mat[i][i];
      
        if(i!=k)
        {
            sum=sum+mat[i][k];
        }
 }
 return sum;
    }
}