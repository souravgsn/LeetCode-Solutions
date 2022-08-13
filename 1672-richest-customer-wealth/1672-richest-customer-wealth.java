class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum =0;
        int ts =0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0 ;j<accounts[i].length;j++){
                ts+=accounts[i][j];
            }
            if(ts>sum){
                sum =ts;
            }
            ts=0;
        }
        return sum;
    }
}