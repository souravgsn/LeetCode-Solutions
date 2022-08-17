class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = (start + end)/2;
            if(mid * mid == num) return true;
             if (mid * mid < num) { // mid is small -> go right to increase mid
                start = mid + 1;
            } else {
                end = mid - 1; // mid is large -> to left to decrease mid
            }
        }
        return false;
    }
}