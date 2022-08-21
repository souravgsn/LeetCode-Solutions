class Solution {
    public boolean halvesAreAlike(String s) {
//         s = s.toLowerCase();
//         String str = s.substring(0,s.length()/2);
//         String str2 = s.substring(s.length()/2);
//         int count =0;
//         for(int i = 0; i < str.length(); i++){
//             if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
//               || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                 count++;
//             }

//             if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i'
//               || str2.charAt(i) == 'o' || str2.charAt(i) == 'u'){
//                 count--;
//             }
//         }
//         return (count ==0);
            HashSet<Character> set = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray())
            set.add(c);
    
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (set.contains(s.charAt(i))) count++;
            if (set.contains(s.charAt(i + s.length() / 2))) count--;
        }
    
        return count == 0;
    }
}