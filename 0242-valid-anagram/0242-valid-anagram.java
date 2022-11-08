class Solution {

    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        if (Arrays.equals(charsS, charsT)) return true;
        return false;
    }
}