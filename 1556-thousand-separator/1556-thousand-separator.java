class Solution {
    public String thousandSeparator(int n) {
        if(n == 0) return "0";
        String ans = "";
        int count = 0;
        while(n > 0) {
            if(count % 3 == 0 && count > 0 ) ans = '.' + ans;
            count++;
            ans = Integer.toString(n % 10) + ans;
            n /= 10;
        }
        return ans;
    }
}