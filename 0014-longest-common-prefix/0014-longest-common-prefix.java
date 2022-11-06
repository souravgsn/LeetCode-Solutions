class Solution {
 public static String longestCommonPrefix(String[] str) {
        if(str.length == 1) return str[0];    
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int count = 0; 
        if(first.length() == 0 || last.length() == 0) return "";
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != last.charAt(i)){
                return first.substring(0,i);
            }
            count++;
        }
        if(count != 0 ){
            return first.substring(0,count);
        }
        return "";
    
    }
}