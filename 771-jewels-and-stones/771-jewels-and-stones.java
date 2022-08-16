class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        int j = jewels.length()-1;
        while(j>=0){
        for (int i = 0; i < stones.length(); i++) {
            if(jewels.charAt(j) == stones.charAt(i)){
                count++;
            }
            else if(jewels.charAt(j) == stones.charAt(i)){
                count++;
            }
        }
        j--;
    }
        return count;
    }
}