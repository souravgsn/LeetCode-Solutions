class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Boolean> mapt = new HashMap<>();
        
        for(int i = 0; i< s.length(); i++) {
            if(maps.containsKey(s.charAt(i))) {
                if(maps.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else if(mapt.containsKey(t.charAt(i))) {
                 return false;
            }
            else {
                maps.put(s.charAt(i), t.charAt(i));
                mapt.put( t.charAt(i), true);
            }
        }
        return true;
    }
}