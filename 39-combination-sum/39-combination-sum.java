class Solution {
     public List<List<Integer>> combinationSum(int[] arr, int k) {
        List<List<Integer>> ans = new ArrayList<>();
      
        int sum= 0;
        int i=0;
        f(i,arr,new ArrayList<>(),k,sum,ans);
        return ans;
    }
   
     void f(int i,int arr[], ArrayList<Integer> p,int k ,int sum ,List<List<Integer>> ans){
        if(sum>k){
            return;
        }
        if(i==arr.length){
        
            if(k == sum){
                
                ans.add(new ArrayList<>(p));
                
            }
           
            
            return;
        }
        p.add(arr[i]);
        sum+= arr[i];
        f(i,arr,p,k,sum,ans);

        p.remove(p.size()-1);
        sum-=arr[i];
        f(i+1,arr,p,k,sum,ans);


    }
}