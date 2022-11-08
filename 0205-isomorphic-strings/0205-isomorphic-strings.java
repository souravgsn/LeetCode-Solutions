class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Boolean> mapt = new HashMap<>();
        
        for(int i = 0; i< s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(maps.containsKey(ch1)) {
                if(maps.get(ch1) != ch2) return false;
            }
            else if(mapt.containsKey(ch2)) {
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