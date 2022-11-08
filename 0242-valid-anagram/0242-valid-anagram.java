class Solution {
    public boolean isAnagram(String s, String t) {
     
        if(s.length() != t.length()) return false;
        
        int[] counter = new int[26];
        
        for(int idx = 0; idx < s.length(); idx++){
            counter[s.charAt(idx)-'a']++;
            counter[t.charAt(idx)-'a']--;
        }
   
        for(int idx: counter){
            if(idx != 0)
                return false;
        }
        return true;
    }
}