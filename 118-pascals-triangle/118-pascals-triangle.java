class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int sum =0;
        for (int i = 0; i < numRows; i++) {
            List<Integer> ds = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                
                if(j==0 || i==0 || j==i){
                    ds.add(1);
                }
                else{
                sum = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                ds.add(sum);
                }
            }
            ans.add(ds);
        }
        return ans;
    }
}