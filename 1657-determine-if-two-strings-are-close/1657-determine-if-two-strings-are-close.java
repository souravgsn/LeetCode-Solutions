import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        Arrays.fill(arr1, 0);
        Arrays.fill(arr2, 0);
        int l1 = word1.length();
        int l2 = word2.length();
        
        if(l1 != l2)
            return false;
        
        for (int i = 0; i < l1; i++) {
            int j = word1.charAt(i) - 'a';
            arr1[j]++;
            j = word2.charAt(i ) -'a';
            arr2[j]++;
        }
        for(int i =0 ; i<26 ;i++){
            if(arr1[i] == 0 && arr2[i] != 0) return false;
            if(arr2[i] == 0 && arr1[i] != 0) return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i <26; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        
        return true;
    }
}