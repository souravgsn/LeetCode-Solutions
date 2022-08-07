class Solution {
    public int fib(int n) {
      int a= 0,b=1;
     
      int s=0;
        if(n==1){
            return 1;
        }
           n--;
      while(n>0){
        s= a + b;
        a = b;
        b = s;
        --n;
      }
        
      return s;
    }
}