class Solution {
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
           if (strs.length == 1) {
            ans.add(Arrays.asList(strs));
            return ans;
        }
        String[] cpy = strs.clone();
        for (int i = 0; i < cpy.length; i++) {
            cpy[i] = sortString(cpy[i]);            
        }
        
        for (int i = 0; i < cpy.length; i++) {
            List<String> ls = new ArrayList<>();
            String x = cpy[i];
            if(x != null){
                ls.add(strs[i]);
            }
            if(cpy[i] != null){
            for (int j = i+1; j < cpy.length; j++) {
              
                if(cpy[i].equals(cpy[j]) && cpy[j] != null){
                
                    ls.add(strs[j]);
                    cpy[j] = null;
                }

            }
        
            ans.add(ls);
        }
        }
        return ans;
    }
 
}