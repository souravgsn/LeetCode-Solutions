class Solution {
    public static boolean areNumbersAscending(String s) {
        int last = -1;
        String[] na  = s.split(" ");
        System.out.println(Arrays.toString(na));
        for (int i = 0; i < na.length; i++) {
            for (Character x : na[i].toCharArray()) {
                // System.out.println(x);
                if(Character.isAlphabetic(x)) break;
                int y = Integer.parseInt(na[i]);
                if(y>last){
                    last = y;
                    break;
                } else{
                    return false;
                }
                
            }
        }
       

        return true;
    }
}