import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
            HashMap<Character,Integer> map = new HashMap<>();
            
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }    
                else{
                    map.put(ch,1);
                }
            }
            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)-1);
                }    
                else{
                    map.put(ch,1);
                }
            }

            for (int x : map.values()) {
                if(x !=0) return false;
            }
            
            return true;
    }
}