class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            for(int i =0; i <(image.length+1)/2 ;i++){
                int temp = row[i]^1;
                row[i] = row[image.length -1-i]^1;
                row[image.length -1-i]= temp;
            }
            
        }
        return image;
    }
}