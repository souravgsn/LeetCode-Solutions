/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long start =1;
        long end = n;
        while(start<=end){
            long mid = end - (end-start)/2;  
            int i=(int)mid;  
            int guess  = guess(i);
            if(guess == 0) return i;
            if(guess == -1){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return n;
    }
}