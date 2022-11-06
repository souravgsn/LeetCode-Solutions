
import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arrOfStr = s.split(" ");
    
        
        for(int i = arrOfStr.length-1 ;i>=0; i--){
            
            if(arrOfStr[i] != ""){
            
                str.append(arrOfStr[i]);
                str.append(" ");
            }
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}