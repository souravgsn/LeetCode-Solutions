class Solution {
    public int maximum69Number (int num) {
          StringBuilder temp = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '6'){
                temp.setCharAt(i, '9');
                break;
            }


        }
    
        return Integer.parseInt(temp.toString());    
    }
}