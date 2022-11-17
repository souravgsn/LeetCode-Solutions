import java.util.*;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];       
       for (char c : s.toCharArray()) {
			arr[c - 'a']++;
	   }
	   int count = arr[s.charAt(0) - 'a'];
    
	   for (int x : arr) {
			if(x!=0 && x != count) return false; 
				
	   }
	   return true;
	}

}