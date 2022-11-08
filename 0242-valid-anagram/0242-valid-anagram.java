class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);

        for (int i = 0; i < ch2.length; i++) {
            if(chars[i] != ch2[i]) return false; 
        }
        
        return true;
    }
}