class Solution {
    public boolean isPalindrome(int n) {
        
      int sum =0;
        int temp =n;
        if(n<0){
            return false;
        }    
        while(n>0){
            int rem = n%10;
            sum = sum *10 +rem;
            n=n/10;
                
        }
        return sum == temp;
    }
   
    
}