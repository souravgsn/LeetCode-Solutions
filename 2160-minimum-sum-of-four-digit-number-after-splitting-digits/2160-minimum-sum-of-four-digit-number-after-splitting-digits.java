class Solution {
    public int minimumSum(int num) {
        
        String temp = Integer.toString(num);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(newGuess);
        int p1 = newGuess[0]*10 + newGuess[3];
        int p2 = newGuess[1]*10 + newGuess[2];
        return p1+p2;
    }
}